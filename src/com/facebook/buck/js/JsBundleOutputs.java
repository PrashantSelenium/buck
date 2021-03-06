/*
 * Copyright 2017-present Facebook, Inc.
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

package com.facebook.buck.js;

import com.facebook.buck.rules.BuildRule;
import com.facebook.buck.rules.SourcePath;

/**
 * Represents output paths of JS builds, consisting of JavaScript build output, a corresponding
 * source map, and assets/resources used from within the packaged JS source code.
 */
public interface JsBundleOutputs extends BuildRule {
  /**
   * @return the file name of the main JavaScript bundle file. This does not necessarily have to be
   * the only JavaScript file written.
   */
  String getBundleName();

  /**
   * @return the {@link SourcePath} to the built JavaScript. Can be a directory.
   */
  @Override
  default SourcePath getSourcePathToOutput() {
    return JsUtil.relativeToOutputRoot(
        getBuildTarget(),
        getProjectFilesystem(),
        "js");
  }

  /**
   * @return a {@link SourcePath} to a source map belonging to the built JavaScript. Typically a
   * single file.
   */
  default SourcePath getSourcePathToSourceMap() {
    return JsUtil.relativeToOutputRoot(
        getBuildTarget(),
        getProjectFilesystem(),
        String.format("map/%s.map", getBundleName()));
  }

  /**
   * @return the {@link SourcePath} to a directory containing the resources (or assets) used by the
   * bundled JavaScript source code.
   */
  default SourcePath getSourcePathToResources() {
    return JsUtil.relativeToOutputRoot(
        getBuildTarget(),
        getProjectFilesystem(),
        "res");
  }

}
