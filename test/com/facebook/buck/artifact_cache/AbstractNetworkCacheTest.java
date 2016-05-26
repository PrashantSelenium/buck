/*
 * Copyright 2016-present Facebook, Inc.
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

package com.facebook.buck.artifact_cache;

import com.facebook.buck.event.BuckEventBus;
import com.facebook.buck.io.BorrowablePath;
import com.facebook.buck.io.LazyPath;
import com.facebook.buck.rules.RuleKey;
import com.facebook.buck.slb.HttpService;
import com.facebook.buck.testutil.FakeProjectFilesystem;
import com.facebook.buck.util.concurrent.FakeListeningExecutorService;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class AbstractNetworkCacheTest {

  @Test
  public void testBigArtifactIsNotStored()
      throws InterruptedException, IOException, ExecutionException {
    testStoreCall(0, Optional.of(10L), 11, 111);
  }

  @Test
  public void testBigArtifactIsStored()
      throws InterruptedException, IOException, ExecutionException {
    testStoreCall(2, Optional.of(10L), 5, 10);
  }

  @Test
  public void testBigArtifactIsStoredWhenMaxIsNotDefined()
      throws InterruptedException, IOException, ExecutionException {
    testStoreCall(4, Optional.<Long>absent(), 5, 10, 100, 1000);
  }

  private void testStoreCall(
      int expectStoreCallCount,
      Optional<Long> maxArtifactSizeBytes,
      int... artifactBytes) throws InterruptedException, IOException, ExecutionException {
    final AtomicInteger storeCallCount = new AtomicInteger(0);
    FakeProjectFilesystem filesystem = new FakeProjectFilesystem();
    ListeningExecutorService service = new FakeListeningExecutorService() {
      @Override
      public void execute(Runnable command) {
        command.run();
      }
    };

    AbstractNetworkCache cache = new AbstractNetworkCache(
        "AbstractNetworkCacheTest",
        EasyMock.createMock(HttpService.class),
        EasyMock.createMock(HttpService.class),
        true,
        filesystem,
        EasyMock.createMock(BuckEventBus.class),
        service,
        "super error message",
        maxArtifactSizeBytes) {
      @Override
      protected CacheResult fetchImpl(
          RuleKey ruleKey,
          LazyPath output,
          HttpArtifactCacheEvent.Finished.Builder eventBuilder) throws IOException {
        return null;
      }

      @Override
      protected void storeImpl(
          ArtifactInfo info,
          Path file,
          HttpArtifactCacheEvent.Finished.Builder eventBuilder) throws IOException {
        storeCallCount.incrementAndGet();
      }
    };

    for (int bytes : artifactBytes) {
      Path path = filesystem.getPathForRelativePath("topspin_" + this.getClass().getName());
      filesystem.writeBytesToPath(new byte[bytes], path);
      ListenableFuture<Void> future = cache.store(
          ArtifactInfo.builder().build(),
          BorrowablePath.notBorrowablePath(path));
      future.get();
    }

    Assert.assertEquals(expectStoreCallCount, storeCallCount.get());
  }
}
