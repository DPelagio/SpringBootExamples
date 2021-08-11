package com.example.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyTestApplication {

  private static Logger log = LoggerFactory.getLogger(StrategyTestApplication.class);

  public static void main(String[] args) {

    //https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
    //https://www.baeldung.com/java-strategy-pattern
    //https://refactoring.guru/es/design-patterns/strategy/java/example
    //https://www.geeksforgeeks.org/strategy-pattern-set-1/
    SpringApplication.run(StrategyTestApplication.class, args);
    log.info("hello");
  }

}
