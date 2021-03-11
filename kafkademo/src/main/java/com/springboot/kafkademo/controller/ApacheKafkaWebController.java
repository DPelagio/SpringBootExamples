package com.springboot.kafkademo.controller;

import com.springboot.kafkademo.service.KafkaSender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {
    KafkaSender kafkasender;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message){
        kafkasender.send(message);

        return "Message was sent to the Kafka Topic Succeessfully";
    }
}
