package com.qualifier.qualifier.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("Persona2")
public class PersonaRepoImpl2 implements IPersonaRepo {

    private static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl2.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("Hola, demos la bienvenida a : " + nombre);
    }
    
}
