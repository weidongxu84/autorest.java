// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.singlediscriminator.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The second level model in polymorphic single level inheritance.
 */
@Immutable
public final class Sparrow extends Bird {
    /**
     * Creates an instance of Sparrow class.
     * 
     * @param wingspan the wingspan value to set.
     */
    @Generated
    public Sparrow(int wingspan) {
        super(wingspan);
        setKind("sparrow");
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("wingspan", getWingspan());
        jsonWriter.writeStringField("kind", getKind());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Sparrow from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Sparrow if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Sparrow.
     */
    @Generated
    public static Sparrow fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int wingspan = 0;
            String kind = "sparrow";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("wingspan".equals(fieldName)) {
                    wingspan = reader.getInt();
                } else if ("kind".equals(fieldName)) {
                    kind = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            Sparrow deserializedSparrow = new Sparrow(wingspan);
            deserializedSparrow.setKind(kind);

            return deserializedSparrow;
        });
    }
}
