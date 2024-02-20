// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.multipart.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Size model.
 */
@Immutable
public final class Size implements JsonSerializable<Size> {
    /*
     * The width property.
     */
    @Generated
    private final int width;

    /*
     * The height property.
     */
    @Generated
    private final int height;

    /**
     * Creates an instance of Size class.
     * 
     * @param width the width value to set.
     * @param height the height value to set.
     */
    @Generated
    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Get the width property: The width property.
     * 
     * @return the width value.
     */
    @Generated
    public int getWidth() {
        return this.width;
    }

    /**
     * Get the height property: The height property.
     * 
     * @return the height value.
     */
    @Generated
    public int getHeight() {
        return this.height;
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("width", this.width);
        jsonWriter.writeIntField("height", this.height);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Size from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Size if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Size.
     */
    @Generated
    public static Size fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int width = 0;
            int height = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("width".equals(fieldName)) {
                    width = reader.getInt();
                } else if ("height".equals(fieldName)) {
                    height = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new Size(width, height);
        });
    }
}
