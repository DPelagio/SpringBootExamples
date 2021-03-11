package com.qualifier.qualifier.service;

import com.qualifier.qualifier.repository.IPersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    @Qualifier("Persona2")
    private IPersonaRepo repo;

    @Override
    public void registar(String nombre) {
        repo.registrar(nombre);
    }
    
}
