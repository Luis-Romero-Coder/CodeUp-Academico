/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.registroacademico.domain;

/**
 *
 * @author Coder
 */
public class Nota {
    private final double value;
    
    public Nota(double value){
        if (value < 0.0 || value > 5.0){
            throw new IllegalArgumentException("The note must be between 5.0 and 0.0");
        }
        
        this.value = value;
        
    }
    
    public double getValue(){
        return value;
    }
    
}
