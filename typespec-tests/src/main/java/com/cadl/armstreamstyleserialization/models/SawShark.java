// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.cadl.armstreamstyleserialization.fluent.models.AnotherFishProperties;
import com.cadl.armstreamstyleserialization.fluent.models.FishProperties;
import java.io.IOException;

/**
 * The third level model SawShark in polymorphic multiple levels inheritance.
 */
@Fluent
public final class SawShark extends Shark {
    /*
     * Discriminator property for Fish.
     */
    private String kind = "shark";

    /*
     * The sharktype property.
     */
    private String sharktype = "saw";

    /*
     * The dna property.
     */
    private String dna;

    /*
     * The age property.
     */
    private int age;

    /*
     * The properties property.
     */
    private FishProperties innerProperties = new FishProperties();

    /*
     * The anotherProperties property.
     */
    private AnotherFishProperties innerAnotherProperties = new AnotherFishProperties();

    /**
     * Creates an instance of SawShark class.
     */
    public SawShark() {
    }

    /**
     * Get the kind property: Discriminator property for Fish.
     * 
     * @return the kind value.
     */
    @Override
    public String kind() {
        return this.kind;
    }

    /**
     * Get the sharktype property: The sharktype property.
     * 
     * @return the sharktype value.
     */
    @Override
    public String sharktype() {
        return this.sharktype;
    }

    /**
     * Get the dna property: The dna property.
     * 
     * @return the dna value.
     */
    public String dna() {
        return this.dna;
    }

    /**
     * Set the dna property: The dna property.
     * 
     * @param dna the dna value to set.
     * @return the SawShark object itself.
     */
    public SawShark withDna(String dna) {
        this.dna = dna;
        return this;
    }

    /**
     * Get the age property: The age property.
     * 
     * @return the age value.
     */
    public int age() {
        return this.age;
    }

    /**
     * Set the age property: The age property.
     * 
     * @param age the age value to set.
     * @return the SawShark object itself.
     */
    public SawShark withAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private FishProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the innerAnotherProperties property: The anotherProperties property.
     * 
     * @return the innerAnotherProperties value.
     */
    private AnotherFishProperties innerAnotherProperties() {
        return this.innerAnotherProperties;
    }

    /**
     * Get the length property: The length property.
     * 
     * @return the length value.
     */
    public double length() {
        return this.innerProperties() == null ? 0.0 : this.innerProperties().length();
    }

    /**
     * Set the length property: The length property.
     * 
     * @param length the length value to set.
     * @return the SawShark object itself.
     */
    public SawShark withLength(double length) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FishProperties();
        }
        this.innerProperties().withLength(length);
        return this;
    }

    /**
     * Get the patten property: The patten property.
     * 
     * @return the patten value.
     */
    public String patten() {
        return this.innerProperties() == null ? null : this.innerProperties().patten();
    }

    /**
     * Get the requiredString property: The requiredString property.
     * 
     * @return the requiredString value.
     */
    public String requiredString() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredString();
    }

    /**
     * Set the requiredString property: The requiredString property.
     * 
     * @param requiredString the requiredString value to set.
     * @return the SawShark object itself.
     */
    public SawShark withRequiredString(String requiredString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FishProperties();
        }
        this.innerProperties().withRequiredString(requiredString);
        return this;
    }

    /**
     * Get the length property: The length property.
     * 
     * @return the length value.
     */
    public double lengthAnotherPropertiesLength() {
        return this.innerAnotherProperties() == null ? 0.0 : this.innerAnotherProperties().length();
    }

    /**
     * Set the length property: The length property.
     * 
     * @param length the length value to set.
     * @return the SawShark object itself.
     */
    public SawShark withLengthAnotherPropertiesLength(double length) {
        if (this.innerAnotherProperties() == null) {
            this.innerAnotherProperties = new AnotherFishProperties();
        }
        this.innerAnotherProperties().withLength(length);
        return this;
    }

    /**
     * Get the patten property: The patten property.
     * 
     * @return the patten value.
     */
    public String pattenAnotherPropertiesPatten() {
        return this.innerAnotherProperties() == null ? null : this.innerAnotherProperties().patten();
    }

    /**
     * Get the requiredString property: The requiredString property.
     * 
     * @return the requiredString value.
     */
    public String requiredStringAnotherPropertiesRequiredString() {
        return this.innerAnotherProperties() == null ? null : this.innerAnotherProperties().requiredString();
    }

    /**
     * Set the requiredString property: The requiredString property.
     * 
     * @param requiredString the requiredString value to set.
     * @return the SawShark object itself.
     */
    public SawShark withRequiredStringAnotherPropertiesRequiredString(String requiredString) {
        if (this.innerAnotherProperties() == null) {
            this.innerAnotherProperties = new AnotherFishProperties();
        }
        this.innerAnotherProperties().withRequiredString(requiredString);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (dna() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property dna in model SawShark"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model SawShark"));
        } else {
            innerProperties().validate();
        }
        if (innerAnotherProperties() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property innerAnotherProperties in model SawShark"));
        } else {
            innerAnotherProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SawShark.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeIntField("age", age());
        jsonWriter.writeJsonField("properties", innerProperties());
        jsonWriter.writeJsonField("anotherProperties", innerAnotherProperties());
        jsonWriter.writeStringField("dna", this.dna);
        jsonWriter.writeIntField("age", this.age);
        jsonWriter.writeStringField("sharktype", this.sharktype);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SawShark from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SawShark if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SawShark.
     */
    public static SawShark fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SawShark deserializedSawShark = new SawShark();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedSawShark.innerProperties = FishProperties.fromJson(reader);
                } else if ("anotherProperties".equals(fieldName)) {
                    deserializedSawShark.innerAnotherProperties = AnotherFishProperties.fromJson(reader);
                } else if ("dna".equals(fieldName)) {
                    deserializedSawShark.dna = reader.getString();
                } else if ("age".equals(fieldName)) {
                    deserializedSawShark.age = reader.getInt();
                } else if ("sharktype".equals(fieldName)) {
                    deserializedSawShark.sharktype = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSawShark;
        });
    }
}
