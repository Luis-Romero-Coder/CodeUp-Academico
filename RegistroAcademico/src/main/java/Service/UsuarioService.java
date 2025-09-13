/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Coder
 */
public class UsuarioService {
    private final Map<String, String> usuarios = new HashMap<>();
    
    public UsuarioService(){
        usuarios.put("admin", "1234");
        usuarios.put("profesor", "abcd");
    }
    
    public boolean autenticar(String user, char[] password){
        String passIngresada = new String(password);
        return usuarios.containsKey(user) && usuarios.get(user).equals(passIngresada);
    }
}
