/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.codeup.registroacademico.domain.Estudiante;
import java.io.*;
import java.util.*;

/**
 *
 * @author Coder
 */
public class ArchivoService {
    public void guardarCSV(File archivo, List<Estudiante> estudiantes) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))){
            for (Estudiante e : estudiantes){
                pw.println(e.getId() + "," + e.getNombre() + "," + e.getEdad() + ","
                    + e.getNota1() + "," + e.getNota2() + "," + e.getNota3());
            }
        }
    }
    
    public List<Estudiante> cargarCSV(File archivo)throws IOException {
        List<Estudiante> lista = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while  ((liena = br.readLine()) != null){
                String[] partes = linea.split(",");
                if (partes.length != 6){
                    throw new IOException ("Formato invalido: cada fila debe tener 6 columnas");
                }
                String id = partes [0];
                String nombre = partes [1];
                int edad = Integer.parseInt(partes [2]);
                double nota1 = Double.parseDouble(partes [3]);
                double nota2 = Double.parseDouble(partes [4]);
                double nota3 = Double.parseDouble(partes [5]);
                
                lista.add(new Estudiante(id, nombre, edad, nota1, nota2, nota3));
            }
        }
        return lista;
    }
}
