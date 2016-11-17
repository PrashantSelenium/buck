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

package com.facebook.buck.cxx;

import com.facebook.buck.rules.BuildRuleParams;
import com.facebook.buck.rules.NoopBuildRule;
import com.facebook.buck.rules.SourcePathResolver;
import com.google.common.collect.ImmutableList;

public abstract class PrebuiltCxxLibrary
    extends NoopBuildRule
    implements AbstractCxxLibrary, CanProvideNativeLinkTarget {

  PrebuiltCxxLibrary(BuildRuleParams params, SourcePathResolver resolver) {
    super(params, resolver);
  }

  public abstract ImmutableList<String> getExportedLinkerFlags(CxxPlatform cxxPlatform);

}
