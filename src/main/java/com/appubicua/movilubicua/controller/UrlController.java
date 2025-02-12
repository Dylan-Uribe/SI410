package com.appubicua.movilubicua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api")
public class UrlController {

    @GetMapping("/current-url")
    public String getCurrentUrl() {
        return ServletUriComponentsBuilder.fromCurrentRequest().toUriString();
    }
}
