// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.dpgcustomization.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The LroProduct model.
 */
@Immutable
public final class LroProduct extends Product {
    /*
     * The provisioningState property.
     */
    @Generated
    private final String provisioningState;

    /**
     * Creates an instance of LroProduct class.
     * 
     * @param received the received value to set.
     * @param provisioningState the provisioningState value to set.
     */
    @Generated
    public LroProduct(ProductReceived received, String provisioningState) {
        super(received);
        this.provisioningState = provisioningState;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     * 
     * @return the provisioningState value.
     */
    @Generated
    public String getProvisioningState() {
        return this.provisioningState;
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("received", getReceived() == null ? null : getReceived().toString());
        jsonWriter.writeStringField("provisioningState", this.provisioningState);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LroProduct from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LroProduct if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LroProduct.
     */
    @Generated
    public static LroProduct fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean receivedFound = false;
            ProductReceived received = null;
            boolean provisioningStateFound = false;
            String provisioningState = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("received".equals(fieldName)) {
                    received = ProductReceived.fromString(reader.getString());
                    receivedFound = true;
                } else if ("provisioningState".equals(fieldName)) {
                    provisioningState = reader.getString();
                    provisioningStateFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (receivedFound && provisioningStateFound) {
                return new LroProduct(received, provisioningState);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!receivedFound) {
                missingProperties.add("received");
            }
            if (!provisioningStateFound) {
                missingProperties.add("provisioningState");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
