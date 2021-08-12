package com.example.strategy.service.impl;

import com.example.strategy.controller.EventExposure;
import com.example.strategy.service.HandleRequests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HandleRequestsImpl implements HandleRequests {
  private static Logger log = LoggerFactory.getLogger(EventExposure.class);

  public HandleRequestsImpl() {
  }

  @Override
  public ResponseEntity<String> authorize(String message) {
    if(message.equals("hola")){
      log.info("hellooooo " + message);
      return new ResponseEntity<>("Message Accepted", HttpStatus.OK);
    }
    log.info("byeeeeeeeee " + message);
    return new ResponseEntity<>("Message Denied", HttpStatus.BAD_REQUEST);
  }
}
