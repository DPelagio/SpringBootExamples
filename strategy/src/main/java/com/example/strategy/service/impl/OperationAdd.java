package com.example.strategy.service.impl;

import com.example.strategy.service.Strategy;

public class OperationAdd implements Strategy {

  @Override
  public int operation(int number1, int number2) {
    return number1 + number2;
  }
}
