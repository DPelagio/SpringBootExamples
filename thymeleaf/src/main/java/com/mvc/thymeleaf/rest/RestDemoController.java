package com.mvc.thymeleaf.rest;

import java.util.List;

import com.mvc.thymeleaf.model.Persona;
import com.mvc.thymeleaf.repo.IPersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
    
    @Autowired
    IPersonaRepo repo;

    @GetMapping
    public List<Persona> listar(){
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Persona p){
        repo.save(p);
    }

    @PutMapping
    public void modificar(@RequestBody Persona p){
        repo.save(p);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
