// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.template;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.fluent.model.arm.ErrorClientModel;
import com.azure.autorest.fluent.util.FluentUtils;
import com.azure.autorest.model.clientmodel.ClientModel;
import com.azure.autorest.model.clientmodel.ClientModelProperty;
import com.azure.autorest.template.StreamSerializationModelTemplate;
import com.azure.core.util.CoreUtils;

public class FluentStreamStyleSerializationModelTemplate extends StreamSerializationModelTemplate {
    private static final FluentModelTemplate FLUENT_MODEL_TEMPLATE = FluentModelTemplate.getInstance();

    public static FluentStreamStyleSerializationModelTemplate getInstance() {
        return new FluentStreamStyleSerializationModelTemplate();
    }

    @Override
    protected String getGetterName(ClientModel model, ClientModelProperty property) {
        return FLUENT_MODEL_TEMPLATE.getGetterName(model, property);
    }

    @Override
    protected boolean parentModelHasValidate(String parentModelName) {
        return FLUENT_MODEL_TEMPLATE.parentModelHasValidate(parentModelName);
    }

    @Override
    protected boolean isManagementErrorSubclass(ClientModel model, JavaSettings settings) {
        if (CoreUtils.isNullOrEmpty(model.getParentModelName())) {
            return false;
        }
        boolean manageErrorParent = false;
        String parentModelName = model.getParentModelName();
        while (parentModelName != null) {
            ClientModel parentModel = FluentUtils.getClientModel(parentModelName);
            if (parentModel == ErrorClientModel.MANAGEMENT_ERROR) {
                manageErrorParent = true;
                break;
            }
            parentModelName = parentModel.getParentModelName();
        }
        return manageErrorParent;
    }
}
