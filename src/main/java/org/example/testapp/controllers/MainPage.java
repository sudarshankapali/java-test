package org.example.testapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {
    @GetMapping()
    public String index() {
        return "Hello World";
    }
}
