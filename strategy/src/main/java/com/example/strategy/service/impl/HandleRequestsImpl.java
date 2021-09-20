package com.example.strategy.service.impl;

import com.example.strategy.controller.EventExposure;
import com.example.strategy.service.HandleRequests;
import com.example.strategy.service.Strategy;
import java.util.List;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HandleRequestsImpl implements HandleRequests {

  private static Logger log = LoggerFactory.getLogger(EventExposure.class);
  private List<Strategy> strategies;

  @Override
  public ResponseEntity<String> authorize(String message) {

    this.strategies.stream().filter(c -> c.applu(11)).forEach(c -> c.operation(2,3));
    //log.info("byeeeeeeeee");
    return new ResponseEntity<>("Message Accepted", HttpStatus.OK);
  }
}
