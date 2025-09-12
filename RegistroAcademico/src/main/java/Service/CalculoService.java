/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.codeup.registroacademico.domain.Nota;
import java.util.List;

/**
 *
 * @author Coder
 */
public class CalculoService {
    public double promedio(List<Nota> Notas){
        if (Notas == null || Notas.isEmpty()){
            return 0.0;
        }
        double suma = 0.0;
        for (Nota n : Notas){
            suma += n.getValue();
        }
        return suma / Notas.size();
    }
    public Nota notaMaxima(List<Nota> Notas){
        if (Notas == null || Notas.isEmpty()){
            return null;
        }
        Nota max = Notas.get(0);
        for (Nota n : Notas){
            if(n.getValue()> max.getValue()){
                max = n;
            }
        }
        return max;
    }
    public boolean aprobado(double promedio){
        return promedio > 3.0;
    }
}
