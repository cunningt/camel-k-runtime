/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.k.adapter;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.TypeConverter;
import org.apache.camel.support.IntrospectionSupport;

public final class Introspection {
    private Introspection() {
    }

    public static boolean setProperties(TypeConverter typeConverter, Object target, Map<String, Object> properties) throws Exception {
        return IntrospectionSupport.setProperties(typeConverter, target, properties);
    }

    public static boolean setProperty(Object target, String name, Object value) throws Exception {
        return IntrospectionSupport.setProperty(target, name, value, false);
    }

    public static boolean setProperty(Object target, String name, Object value, boolean builderPattern) throws Exception {
        return IntrospectionSupport.setProperty(target, name, value, builderPattern);
    }

    public static Map<String, Object> getProperties(Object target, String optionPrefix, boolean includeNull) {
        Map<String, Object> properties = new HashMap<>();
        IntrospectionSupport.getProperties(target, properties, optionPrefix, includeNull);

        return properties;
    }
}
