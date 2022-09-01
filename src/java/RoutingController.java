package com.example.university.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RoutingController {
    private String username = "benguo";
    private String password = "2003";

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/")
    public boolean homePage() {
        return true;
    }

}
