/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.registroacademico.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Coder
 */
public class Estudiante {
    
    private final String Id;
    private String Nombre;
    private int Edad;
    private List<Nota> Notas;
    
    public Estudiante(String Id, String Nombre, int Edad){
        this.Id = Id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Notas = new ArrayList<>();
    }
    public String getId(){
        return Id;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public int getEdad(){
        return Edad;
    } 
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public List<Nota> getNotas(){
        return Notas;
    }
    public void addNota(Nota Nota){
        this.Notas.add(Nota);
    }
}
