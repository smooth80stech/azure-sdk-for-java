// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.UpdateIntegrationRuntimeNodeRequest;

/** Samples for IntegrationRuntimeNodes Update. */
public final class IntegrationRuntimeNodesUpdateSamples {
    /**
     * Sample code: IntegrationRuntimeNodes_Update.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void integrationRuntimeNodesUpdate(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .integrationRuntimeNodes()
            .updateWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleIntegrationRuntime",
                "Node_1",
                new UpdateIntegrationRuntimeNodeRequest().withConcurrentJobsLimit(2),
                Context.NONE);
    }
}
