/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.codeup.registroacademico.domain.Estudiante;

/**
 *
 * @author Coder
 */
public class CalculoService {
    public double promedio(Estudiante e){
            return (e.getNota1() +  e.getNota2() + e.getNota3()) / 3.0;
    }
    public double notaMaxima(Estudiante e){
        return Math.max(e.getNota1(), Math.max(e.getNota2(), e.getNota3()));
    }
    public boolean aprobado(double promedio){
        return promedio > 3.0;
    }
}
