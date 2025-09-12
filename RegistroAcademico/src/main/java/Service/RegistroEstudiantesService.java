/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.codeup.registroacademico.domain.Estudiante;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

/**
 *
 * @author Coder
 */
public class RegistroEstudiantesService {
    private final List<Estudiante> estudiantes = new ArrayList<>();
    private final CalculoService calculoService = new CalculoService();
    
    public void agregarEstudiantes(Estudiante e){
            estudiantes.add(e);
    }
    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }
    public double calcularPromedio(Estudiante e) {
        return calculoService.notaMaxima(e);
    }
    public boolean estaAprobado(Estudiante e){
        double promedio = calcularPromedio(e);
        return calculoService.aprobado(promedio);
    }
    public double promedioGeneral() {
        if(estudiantes.isEmpty())
            return 0.0;
        double suma = 0.0;
        for  (Estudiante e : estudiantes){
            suma += calcularPromedio(e);
        }
        return suma / estudiantes.size();
    }
    public Optional<Estudiante> mejorEstudiante(){
        return estudiantes.stream()
                .max((e1, e2) -> Double.compare(calcularPromedio(e1), calcularPromedio(e2)));
    }
    public long contarAprobados(){
        return estudiantes.stream().filter(this::estaAprobado).count();
    }
    public long contarReprobados(){
        return estudiantes.stream().filter(e -> !estaAprobado(e)).count();
    }
}
