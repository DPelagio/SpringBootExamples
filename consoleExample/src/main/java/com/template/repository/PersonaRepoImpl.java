package com.template.repository;

import com.template.consoleExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {
    private static Logger log = LoggerFactory.getLogger(consoleExample.class);

    @Override
    public void registrar(String name) {
        log.info(name + " hola, bienvenido!");
    }
    
}
