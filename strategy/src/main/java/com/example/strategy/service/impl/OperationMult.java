package com.example.strategy.service.impl;

import com.example.strategy.service.Strategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperationMult implements Strategy {

  @Override
  public int operation(int number1, int number2) {
    System.out.println("Mult");
    return number1 * number2;
  }

  @Override
  public boolean applu(int x) {
    if(x < 10) return false;
    return true;
  }
}
