package com.example.strategy;

import com.example.strategy.service.Strategy;

public class Context {
  private Strategy strategy;


  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int operationResult(int n1, int n2){
    return strategy.operation(n1 ,n2);
  }
}
