package com.Spring.SpringLearning;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

}
