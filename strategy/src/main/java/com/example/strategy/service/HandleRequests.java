package com.example.strategy.service;

import org.springframework.http.ResponseEntity;

public interface HandleRequests {
  ResponseEntity<String> authorize(String message);
}
