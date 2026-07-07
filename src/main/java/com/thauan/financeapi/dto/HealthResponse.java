package com.thauan.financeapi.dto;

import java.time.Instant;

public class HealthResponse {

    private String status;
    private String application;
    private String version;
    private Instant timestamp;

    public HealthResponse() {
        this.timestamp = Instant.now();
    }

    public HealthResponse(String status, String application, String version) {
        this();
        this.status = status;
        this.application = application;
        this.version = version;
    }

    public static HealthResponse up(String application, String version) {
        return new HealthResponse("UP", application, version);
    }

    public String getStatus() {
        return status;
    }

    public String getApplication() {
        return application;
    }

    public String getVersion() {
        return version;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "HealthResponse{" +
                "status='" + status + '\'' +
                ", application='" + application + '\'' +
                ", version='" + version + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}