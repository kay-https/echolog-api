package com.kay.echolog_api.controller;

import com.kay.echolog_api.service.AuditService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuditController {

    private final AuditService auditService;

    public AuditController(AuditService auditService) {
        this.auditService = auditService;
    }

    @PostMapping("/user")
    public String createUser() {

        auditService.logAction("User created");

        return "User created";
    }

    @PostMapping("/payment")
    public String requestPayment() {

        auditService.logAction("Payment requested");

        return "Payment requested";
    }

    @GetMapping("/logs")
    public Object getLogs() {

        return auditService.getLogs();
    }
}