/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.parsing.parser.statement.select;

import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.mysql.parser.MySQLSelectParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.oracle.parser.OracleSelectParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.postgresql.parser.PostgreSQLSelectParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.sqlserver.parser.SQLServerSelectParser;
import com.dangdang.ddframe.rdb.sharding.constant.DatabaseType;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.SQLParser;

/**
 * Select语句解析器工厂.
 *
 * @author zhangliang
 */
public class SQLSelectParserFactory {
    
    /**
     * 创建Select语句解析器.
     * 
     * @param exprParser 表达式
     * @param dbType 数据库类型
     * @return Select语句解析器
     */
    public static AbstractSelectParser newInstance(final SQLParser exprParser, final DatabaseType dbType) {
        switch (dbType) {
            case H2 :
            case MySQL :
                return new MySQLSelectParser(exprParser);
            case Oracle:
                return new OracleSelectParser(exprParser);
            case SQLServer :
                return new SQLServerSelectParser(exprParser);
            case PostgreSQL :
                return new PostgreSQLSelectParser(exprParser);
            default:
                throw new UnsupportedOperationException(String.format("Cannot support database '%s'.", dbType));
        }
    } 
}
