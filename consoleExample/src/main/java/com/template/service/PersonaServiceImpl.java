package com.template.service;

import com.template.repository.IPersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaRepo repo;

    @Override
    public void registrar(String name) {
        repo.registrar(name);
    }
    
}
