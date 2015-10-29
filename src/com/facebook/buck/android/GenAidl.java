/*
 * Copyright 2012-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.android;

import static com.facebook.buck.jvm.java.Javac.SRC_ZIP;
import static com.facebook.buck.rules.BuildableProperties.Kind.ANDROID;

import com.facebook.buck.event.ConsoleEvent;
import com.facebook.buck.jvm.java.JarDirectoryStep;
import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.model.BuildTargets;
import com.facebook.buck.rules.AbstractBuildRule;
import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.BuildContext;
import com.facebook.buck.rules.BuildRuleParams;
import com.facebook.buck.rules.BuildableContext;
import com.facebook.buck.rules.BuildableProperties;
import com.facebook.buck.rules.SourcePathResolver;
import com.facebook.buck.step.Step;
import com.facebook.buck.step.fs.MakeCleanDirectoryStep;
import com.facebook.buck.step.fs.MkdirStep;
import com.facebook.buck.util.BuckConstant;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Buildable for generating a .java file from an .aidl file. Example:
 * <pre>
 * # This will generate IOrcaService.java in the buck-out/gen directory.
 * gen_aidl(
 *   name = 'orcaservice',
 *   aidl = 'IOrcaService.aidl',
 * )
 *
 * android_library(
 *   name = 'server',
 *   srcs = glob(['*.java']) + [':orcaservice'],
 *   deps = [
 *     '//first-party/orca/lib-base:lib-base',
 *   ],
 * )
 * </pre>
 */
public class GenAidl extends AbstractBuildRule {

  private static final BuildableProperties PROPERTIES = new BuildableProperties(ANDROID);

  // TODO(#2493457): This rule uses the aidl binary (part of the Android SDK), so the RuleKey
  // should incorporate which version of aidl is used.
  @AddToRuleKey
  private final Path aidlFilePath;
  @AddToRuleKey
  private final String importPath;
  private final Path output;
  private final Path genPath;

  GenAidl(
      BuildRuleParams params,
      SourcePathResolver resolver,
      Path aidlFilePath,
      String importPath) {
    super(params, resolver);
    this.aidlFilePath = aidlFilePath;
    this.importPath = importPath;
    BuildTarget buildTarget = params.getBuildTarget();
    this.genPath = BuildTargets.getGenPath(buildTarget, "%s");
    this.output = genPath.resolve(
        String.format("lib%s%s", buildTarget.getShortNameAndFlavorPostfix(), SRC_ZIP));
  }

  @Override
  public BuildableProperties getProperties() {
    return PROPERTIES;
  }

  @Override
  public Path getPathToOutput() {
    return output;
  }

  @Override
  public ImmutableList<Step> getBuildSteps(
      BuildContext context,
      BuildableContext buildableContext) {

    ImmutableList.Builder<Step> commands = ImmutableList.builder();

    commands.add(new MakeCleanDirectoryStep(getProjectFilesystem(), genPath));

    BuildTarget target = getBuildTarget();
    Path outputDirectory = BuildTargets.getScratchPath(target, "__%s.aidl");
    commands.add(new MakeCleanDirectoryStep(getProjectFilesystem(), outputDirectory));

    AidlStep command = new AidlStep(
        getProjectFilesystem(),
        target,
        aidlFilePath,
        ImmutableSet.of(importPath),
        outputDirectory);
    commands.add(command);

    // Files must ultimately be written to GEN_DIR to be used as source paths.
    Path genDirectory = Paths.get(BuckConstant.GEN_DIR, importPath);

    // Warn the user if the genDirectory is not under the output directory.
    if (!importPath.startsWith(target.getBasePath().toString())) {
      // TODO(simons): Make this fatal. Give people some time to clean up their rules.
      context.getEventBus().post(
          ConsoleEvent.warning(
              "%s, gen_aidl import path (%s) should be a child of %s",
              target,
              importPath,
              target.getBasePath()));
    }

    commands.add(new MkdirStep(getProjectFilesystem(), genDirectory));

    commands.add(
        new JarDirectoryStep(
            getProjectFilesystem(),
            output,
            ImmutableSortedSet.of(outputDirectory),
            /* main class */ null,
            /* manifest */ null));
    buildableContext.recordArtifact(output);

    return commands.build();
  }
}
