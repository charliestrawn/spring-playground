package com.charliestrawn.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/greeting")
    public String getRoot(){
        return "hello world";
    }

}
