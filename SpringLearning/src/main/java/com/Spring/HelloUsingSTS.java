package com.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUsingSTS {
    @GetMapping("hello")
    public String sayHello() {
        return "Hello From BridgeLabz";
    }
}
