/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
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
 */

package org.wso2.carbon.andes.event.core.subscription;

import org.apache.axiom.om.OMElement;
import org.wso2.carbon.andes.event.core.exception.EventBrokerConfigurationException;

/**
 * Implementation of this interface used to create and get subscription manager object from given config
 */
public interface SubscriptionManagerFactory {

    /**
     * Return subscription manager object from given config
     *
     * @param config configuration object
     * @return subscription manager
     * @throws EventBrokerConfigurationException
     */
    public SubscriptionManager getSubscriptionManager(OMElement config) throws EventBrokerConfigurationException;
}
