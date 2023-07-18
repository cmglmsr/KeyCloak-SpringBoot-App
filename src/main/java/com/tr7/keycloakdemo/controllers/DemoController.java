package com.tr7.keycloakdemo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('client-user')")
    public String user(){
        return "Welcome to User Page!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client-admin')")
    public String admin() {
        return "Welcome to Admin Page!";
    }
}
