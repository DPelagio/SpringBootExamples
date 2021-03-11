package com.qualifier.qualifier;

import com.qualifier.qualifier.service.IPersonaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualifierApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(QualifierApplication.class);
	@Autowired
	private IPersonaService service;
	public static void main(String[] args) {
		SpringApplication.run(QualifierApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		// System.out.println("Holaaaa!!!");
		String message = "Hola";
		LOG.info(message);
		service.registar("pepe");
	}

}
