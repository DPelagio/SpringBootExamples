package com.example.strategy.controller;

import com.example.strategy.service.HandleRequests;
import com.example.strategy.service.impl.HandleRequestsImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventExposure {
  @Autowired
  private HandleRequestsImpl handleRequests;
  private static Logger log = LoggerFactory.getLogger(EventExposure.class);

  @PostMapping(value = "/test")
  public ResponseEntity<String> eventExposure(@RequestParam("message") String message) {
    log.info(handleRequests.authorize(message).getBody());
    return new ResponseEntity<>(message, HttpStatus.OK);
  }
}
