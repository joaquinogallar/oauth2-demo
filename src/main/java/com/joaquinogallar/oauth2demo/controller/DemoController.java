package com.joaquinogallar.oauth2demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/public/ping")
    public ResponseEntity<String> publicPing() {
        // status: ok
        // visibility: public
        return ResponseEntity.ok("public");
    }

    @GetMapping("/api/secure")
    public ResponseEntity<String> securePing() {
        return ResponseEntity.ok("secure");
    }

    @GetMapping("/api/admin/dashboard")
    public ResponseEntity<String> adminOnly() {
        return ResponseEntity.ok("admin-only");
    }
}
