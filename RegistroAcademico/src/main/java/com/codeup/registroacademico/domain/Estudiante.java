/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.registroacademico.domain;

/**
 *
 * @author Coder
 */
public class Estudiante {
    
    private final String id;
    private String nombre;
    private int edad;
    private double nota1, nota2, nota3;
    
    public Estudiante(String id, String nombre, int edad, double nota1, double nota2, double nota3){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public String getId (){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getNota3(){
        return nota3;
    }
}
