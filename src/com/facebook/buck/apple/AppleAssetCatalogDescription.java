/*
 * Copyright 2014-present Facebook, Inc.
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

package com.facebook.buck.apple;

import com.facebook.buck.rules.BuildRuleParams;
import com.facebook.buck.rules.BuildRuleType;
import com.facebook.buck.rules.ConstructorArg;
import com.facebook.buck.rules.Description;
import com.facebook.buck.util.HumanReadableException;
import com.facebook.buck.util.ProjectFilesystem;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSortedSet;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Set;

/**
 * Description for an apple_asset_catalog rule, which identifies an asset
 * catalog for an iOS or Mac OS X library or binary.
 */
public class AppleAssetCatalogDescription implements Description<AppleAssetCatalogDescription.Arg> {
  public static final BuildRuleType TYPE = new BuildRuleType("apple_asset_catalog");

  @Override
  public BuildRuleType getBuildRuleType() {
    return TYPE;
  }

  @Override
  public Arg createUnpopulatedConstructorArg() {
    return new Arg();
  }

  @Override
  public AppleAssetCatalog createBuildable(BuildRuleParams params, Arg args) {
    final ProjectFilesystem projectFilesystem = params.getProjectFilesystem();
    final Set<Path> dirs = args.dirs;
    Supplier<Collection<Path>> inputPathsSupplier = Suppliers.memoize(
        new Supplier<Collection<Path>>() {
          @Override
          public Collection<Path> get() {
            ImmutableSortedSet.Builder<Path> paths = ImmutableSortedSet.naturalOrder();
            for (Path dir : dirs) {
              try {
                paths.addAll(projectFilesystem.getFilesUnderPath(dir));
              } catch (IOException e) {
                throw new HumanReadableException(e, "Error traversing directory: %s.", dir);
              }
            }
            return paths.build();
          }
        });
    return new AppleAssetCatalog(inputPathsSupplier, args);
  }

  public static class Arg implements ConstructorArg {
    public Set<Path> dirs;
    public Optional<Boolean> copyToBundles;
  }
}
