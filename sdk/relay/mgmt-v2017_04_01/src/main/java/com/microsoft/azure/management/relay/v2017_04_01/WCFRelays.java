/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.relay.v2017_04_01.implementation.WCFRelaysInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.relay.v2017_04_01.WcfRelayNamespaceAuthorizationRule;

/**
 * Type representing WCFRelays.
 */
public interface WCFRelays extends SupportsCreating<WcfRelay.DefinitionStages.Blank>, HasInner<WCFRelaysInner> {
    /**
     * Begins definition for a new AuthorizationRule resource.
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    WcfRelayNamespaceAuthorizationRule.DefinitionStages.Blank defineAuthorizationRule(String name);

    /**
     * Returns the description for the specified WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WcfRelay> getAsync(String resourceGroupName, String namespaceName, String relayName);

    /**
     * Lists the WCF relays within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WcfRelay> listByNamespaceAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String namespaceName, String relayName);

    /**
     * Get authorizationRule for a WCF relay by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WcfRelayNamespaceAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName);

    /**
     * Authorization rules for a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WcfRelayNamespaceAuthorizationRule> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String relayName);

    /**
     * Deletes a WCF relay authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessKeys> listKeysAsync(String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName);

    /**
     * Regenerates the primary or secondary connection strings to the WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName, RegenerateAccessKeyParameters parameters);

}