/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter;

import org.apache.shardingsphere.dbdiscovery.distsql.parser.statement.AlterDatabaseDiscoveryHeartbeatStatement;
import org.apache.shardingsphere.dbdiscovery.distsql.parser.statement.AlterDatabaseDiscoveryRuleStatement;
import org.apache.shardingsphere.dbdiscovery.distsql.parser.statement.AlterDatabaseDiscoveryTypeStatement;
import org.apache.shardingsphere.distsql.parser.statement.rdl.alter.AlterDefaultSingleTableRuleStatement;
import org.apache.shardingsphere.distsql.parser.statement.rdl.alter.AlterRuleStatement;
import org.apache.shardingsphere.encrypt.distsql.parser.statement.AlterEncryptRuleStatement;
import org.apache.shardingsphere.readwritesplitting.distsql.parser.statement.AlterReadwriteSplittingRuleStatement;
import org.apache.shardingsphere.shadow.distsql.parser.statement.AlterDefaultShadowAlgorithmStatement;
import org.apache.shardingsphere.shadow.distsql.parser.statement.AlterShadowAlgorithmStatement;
import org.apache.shardingsphere.shadow.distsql.parser.statement.AlterShadowRuleStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.AlterDefaultShardingStrategyStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.AlterShardingAuditorStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.AlterShardingTableReferenceRuleStatement;
import org.apache.shardingsphere.sharding.distsql.parser.statement.AlterShardingTableRuleStatement;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.SQLCaseAssertContext;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterDatabaseDiscoveryHeartbeatStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterDatabaseDiscoveryRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterDatabaseDiscoveryTypeStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterDefaultShadowAlgorithmStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterDefaultShardingStrategyStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterDefaultSingleTableRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterEncryptRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterReadwriteSplittingRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterShadowAlgorithmStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterShadowRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterShardingAuditorStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterShardingTableReferenceRulesStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.asserts.statement.distsql.rdl.alter.impl.AlterShardingTableRuleStatementAssert;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.SQLParserTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDatabaseDiscoveryHeartbeatStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDatabaseDiscoveryTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDefaultShardingStrategyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDefaultSingleTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterEncryptRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterReadwriteSplittingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShadowAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShadowRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingAuditorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingTableReferenceRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.AlterDefaultShadowAlgorithmStatementTestCase;

/**
 * Alter rule statement assert.
 */
public final class AlterRuleStatementAssert {
    
    /**
     * Assert alter sharding table rule statement is correct with expected parser result.
     *
     * @param assertContext assert context
     * @param actual actual alter sharding table rule statement
     * @param expected expected alter sharding table rule statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final AlterRuleStatement actual, final SQLParserTestCase expected) {
        if (actual instanceof AlterDatabaseDiscoveryRuleStatement) {
            AlterDatabaseDiscoveryRuleStatementAssert.assertIs(assertContext, (AlterDatabaseDiscoveryRuleStatement) actual, expected);
        } else if (actual instanceof AlterDatabaseDiscoveryHeartbeatStatement) {
            AlterDatabaseDiscoveryHeartbeatStatementAssert.assertIs(assertContext, (AlterDatabaseDiscoveryHeartbeatStatement) actual, (AlterDatabaseDiscoveryHeartbeatStatementTestCase) expected);
        } else if (actual instanceof AlterDatabaseDiscoveryTypeStatement) {
            AlterDatabaseDiscoveryTypeStatementAssert.assertIs(assertContext, (AlterDatabaseDiscoveryTypeStatement) actual, (AlterDatabaseDiscoveryTypeStatementTestCase) expected);
        } else if (actual instanceof AlterDefaultShardingStrategyStatement) {
            AlterDefaultShardingStrategyStatementAssert.assertIs(assertContext, (AlterDefaultShardingStrategyStatement) actual, (AlterDefaultShardingStrategyStatementTestCase) expected);
        } else if (actual instanceof AlterEncryptRuleStatement) {
            AlterEncryptRuleStatementAssert.assertIs(assertContext, (AlterEncryptRuleStatement) actual, (AlterEncryptRuleStatementTestCase) expected);
        } else if (actual instanceof AlterReadwriteSplittingRuleStatement) {
            AlterReadwriteSplittingRuleStatementAssert.assertIs(assertContext, (AlterReadwriteSplittingRuleStatement) actual, (AlterReadwriteSplittingRuleStatementTestCase) expected);
        } else if (actual instanceof AlterShardingTableReferenceRuleStatement) {
            AlterShardingTableReferenceRulesStatementAssert.assertIs(assertContext, (AlterShardingTableReferenceRuleStatement) actual, (AlterShardingTableReferenceRulesStatementTestCase) expected);
        } else if (actual instanceof AlterShardingTableRuleStatement) {
            AlterShardingTableRuleStatementAssert.assertIs(assertContext, (AlterShardingTableRuleStatement) actual, expected);
        } else if (actual instanceof AlterShadowRuleStatement) {
            AlterShadowRuleStatementAssert.assertIs(assertContext, (AlterShadowRuleStatement) actual, (AlterShadowRuleStatementTestCase) expected);
        } else if (actual instanceof AlterShadowAlgorithmStatement) {
            AlterShadowAlgorithmStatementAssert.assertIs(assertContext, (AlterShadowAlgorithmStatement) actual, (AlterShadowAlgorithmStatementTestCase) expected);
        } else if (actual instanceof AlterDefaultSingleTableRuleStatement) {
            AlterDefaultSingleTableRuleStatementAssert.assertIs(assertContext, (AlterDefaultSingleTableRuleStatement) actual,
                    (AlterDefaultSingleTableRuleStatementTestCase) expected);
        } else if (actual instanceof AlterShardingAuditorStatement) {
            AlterShardingAuditorStatementAssert.assertIs(assertContext, (AlterShardingAuditorStatement) actual, (AlterShardingAuditorStatementTestCase) expected);
        } else if (actual instanceof AlterDefaultShadowAlgorithmStatement) {
            AlterDefaultShadowAlgorithmStatementAssert.assertIs(assertContext, (AlterDefaultShadowAlgorithmStatement) actual, (AlterDefaultShadowAlgorithmStatementTestCase) expected);
        }
    }
}
