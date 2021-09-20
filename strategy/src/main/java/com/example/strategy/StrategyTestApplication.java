package com.example.strategy;

import com.example.strategy.service.impl.OperationAdd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyTestApplication {

  private static Logger log = LoggerFactory.getLogger(StrategyTestApplication.class);

  public static void main(String[] args) {
    //https://ravthiru.medium.com/strategy-design-pattern-with-in-spring-boot-application-2ff5a7486cd8
    //https://www.baeldung.com/java-strategy-pattern
    //https://refactoring.guru/es/design-patterns/strategy/java/example
    //https://www.geeksforgeeks.org/strategy-pattern-set-1/
    SpringApplication.run(StrategyTestApplication.class, args);
  }

}
