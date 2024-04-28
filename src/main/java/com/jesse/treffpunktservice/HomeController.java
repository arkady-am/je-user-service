package com.jesse.treffpunktservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getGreeting() {
        return "Guten Morgen";
    }

    @GetMapping("/benis")
    public String getResponse() {
        return "Richtig";
    }
}