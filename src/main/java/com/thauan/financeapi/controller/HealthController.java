package com.thauan.financeapi.controller;

import com.thauan.financeapi.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController   {

    @GetMapping("/health")
    public HealthResponse  health() {
        return HealthResponse.up("Finance API", "1.0.0");
    }
}
