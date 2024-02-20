// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.lro.rpc.legacy.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Result of the job.
 */
@Immutable
public final class JobResult implements JsonSerializable<JobResult> {
    /*
     * A processing job identifier.
     */
    @Generated
    private String jobId;

    /*
     * Comment.
     */
    @Generated
    private String comment;

    /*
     * The status of the processing job.
     */
    @Generated
    private JobStatus status;

    /*
     * Error objects that describes the error when status is "Failed".
     */
    @Generated
    private List<ErrorResponse> errors;

    /*
     * The results.
     */
    @Generated
    private List<String> results;

    /**
     * Creates an instance of JobResult class.
     */
    @Generated
    private JobResult() {
    }

    /**
     * Get the jobId property: A processing job identifier.
     * 
     * @return the jobId value.
     */
    @Generated
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the comment property: Comment.
     * 
     * @return the comment value.
     */
    @Generated
    public String getComment() {
        return this.comment;
    }

    /**
     * Get the status property: The status of the processing job.
     * 
     * @return the status value.
     */
    @Generated
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the errors property: Error objects that describes the error when status is "Failed".
     * 
     * @return the errors value.
     */
    @Generated
    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Get the results property: The results.
     * 
     * @return the results value.
     */
    @Generated
    public List<String> getResults() {
        return this.results;
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobResult if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JobResult.
     */
    @Generated
    public static JobResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String jobId = null;
            String comment = null;
            JobStatus status = null;
            List<ErrorResponse> errors = null;
            List<String> results = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobId".equals(fieldName)) {
                    jobId = reader.getString();
                } else if ("comment".equals(fieldName)) {
                    comment = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = JobStatus.fromString(reader.getString());
                } else if ("errors".equals(fieldName)) {
                    errors = reader.readArray(reader1 -> ErrorResponse.fromJson(reader1));
                } else if ("results".equals(fieldName)) {
                    results = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            JobResult deserializedJobResult = new JobResult();
            deserializedJobResult.jobId = jobId;
            deserializedJobResult.comment = comment;
            deserializedJobResult.status = status;
            deserializedJobResult.errors = errors;
            deserializedJobResult.results = results;

            return deserializedJobResult;
        });
    }
}
