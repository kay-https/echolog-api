package com.kay.echolog_api.service;

import com.kay.echolog_api.model.AuditLog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuditService {

    private final List<AuditLog> logs = new ArrayList<>();

    public void logAction(String action) {
        logs.add(new AuditLog(action));
    }

    public List<AuditLog> getLogs() {
        return logs;
    }
}