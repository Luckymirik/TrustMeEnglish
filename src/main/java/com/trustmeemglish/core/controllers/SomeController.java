package com.trustmeemglish.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/hello")
    public String sayHello(){
        return "HelloWorld";

    }
}
