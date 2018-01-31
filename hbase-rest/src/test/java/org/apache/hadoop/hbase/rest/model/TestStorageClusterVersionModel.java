/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.rest.model;

import static org.junit.Assert.assertEquals;

import org.apache.hadoop.hbase.testclassification.RestTests;
import org.apache.hadoop.hbase.testclassification.SmallTests;
import org.junit.experimental.categories.Category;

@Category({RestTests.class, SmallTests.class})
public class TestStorageClusterVersionModel extends TestModelBase<StorageClusterVersionModel> {
  private static final String VERSION = "0.0.1-testing";

  public TestStorageClusterVersionModel() throws Exception {
    super(StorageClusterVersionModel.class);
    AS_XML =
      "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
      "<ClusterVersion Version=\"" + VERSION + "\"/>";

    AS_JSON = "{\"Version\": \"0.0.1-testing\"}";
  }

  @Override
  protected StorageClusterVersionModel buildTestModel() {
    StorageClusterVersionModel model = new StorageClusterVersionModel();
    model.setVersion(VERSION);
    return model;
  }

  @Override
  protected void checkModel(StorageClusterVersionModel model) {
    assertEquals(VERSION, model.getVersion());
  }

  @Override
  public void testFromPB() throws Exception {
    //ignore test no pb
  }
}

