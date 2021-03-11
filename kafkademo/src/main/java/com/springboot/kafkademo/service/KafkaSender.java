package com.springboot.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "TestTopic";
    public void send(String Message){
        kafkaTemplate.send(kafkaTopic, Message);
    }
}
