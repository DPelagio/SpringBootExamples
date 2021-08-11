package com.example.strategy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventExposure {

    @RequestMapping(value = "/test")
    public String eventExposure(@RequestParam("message") String message){
        return "gg";
    }
}
