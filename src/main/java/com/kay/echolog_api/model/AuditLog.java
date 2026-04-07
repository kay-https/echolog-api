package com.kay.echolog_api.model;

import java.time.LocalDateTime;

public class AuditLog {

    private String action;
    private LocalDateTime timestamp;

    public AuditLog(String action) {
        this.action = action;
        this.timestamp = LocalDateTime.now();
    }

    public String getAction() {
        return action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}