package com.mvc.thymeleaf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

    // Se utiliza el indicador id para definir la columna id de la base de datos
    @Id
    private int idPersona;
    // Se utiliza el indicador column para definir las diferentes columnas que integran a la base de datos, se les da el nombre y longitud
    @Column(name="nombre", length = 50)
    private String nombre;

    public int getIdPersona(){
        return idPersona;
    }

    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
