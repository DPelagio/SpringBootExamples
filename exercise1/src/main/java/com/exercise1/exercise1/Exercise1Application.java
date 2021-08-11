package com.exercise1.exercise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Exercise1Application {

	private static Logger LOG = LoggerFactory.getLogger(Exercise1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Exercise1Application.class, args);
		LOG.info("hello world!");
	}

}
