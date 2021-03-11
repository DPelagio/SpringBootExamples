package com.mvc.thymeleaf.repo;

import com.mvc.thymeleaf.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
    
}
