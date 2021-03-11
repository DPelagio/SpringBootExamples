package com.template;

import com.template.service.IPersonaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class consoleExample implements CommandLineRunner {

	// Creamos un log de la libreria logger factory
	private static Logger log = LoggerFactory.getLogger(consoleExample.class);
	// Se necesita instanciar
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(consoleExample.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// System.out.println("hola");
		log.info("Hola, soy informacion");
		log.warn("Hola, soy un warning");
		service.registrar("Daniel");
	}	

}
