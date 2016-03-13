/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.gateway.core.outbound;

import java.util.HashMap;
import java.util.Map;

public class OutboundEPProviderRegistry {

    private Map<String, OutboundEPProvider> outboundEPProviders = new HashMap<>();

    private static OutboundEPProviderRegistry instance = new OutboundEPProviderRegistry();

    private OutboundEPProviderRegistry() {}

    public static OutboundEPProviderRegistry getInstance() {
        return instance;
    }

    public void registerOutboundEPProvider(OutboundEPProvider outboundEPProvider) {
        outboundEPProviders.put(outboundEPProvider.getProtocol(), outboundEPProvider);
    }

    public void unregisterOutboundEPProvider(OutboundEPProvider outboundEPProvider) {
        outboundEPProviders.remove(outboundEPProvider.getProtocol());
    }

}