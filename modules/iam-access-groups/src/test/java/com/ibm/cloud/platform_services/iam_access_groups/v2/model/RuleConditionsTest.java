/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.iam_access_groups.v2.model;

import com.ibm.cloud.platform_services.iam_access_groups.v2.model.RuleConditions;
import com.ibm.cloud.platform_services.iam_access_groups.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RuleConditions model.
 */
public class RuleConditionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRuleConditions() throws Throwable {
    RuleConditions ruleConditionsModel = new RuleConditions.Builder()
      .claim("testString")
      .operator("EQUALS")
      .value("testString")
      .build();
    assertEquals(ruleConditionsModel.claim(), "testString");
    assertEquals(ruleConditionsModel.operator(), "EQUALS");
    assertEquals(ruleConditionsModel.value(), "testString");

    String json = TestUtilities.serialize(ruleConditionsModel);

    RuleConditions ruleConditionsModelNew = TestUtilities.deserialize(json, RuleConditions.class);
    assertTrue(ruleConditionsModelNew instanceof RuleConditions);
    assertEquals(ruleConditionsModelNew.claim(), "testString");
    assertEquals(ruleConditionsModelNew.operator(), "EQUALS");
    assertEquals(ruleConditionsModelNew.value(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRuleConditionsError() throws Throwable {
    new RuleConditions.Builder().build();
  }

}