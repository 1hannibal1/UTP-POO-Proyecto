/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class UsuarioManager {



    private final ArrayList<usu> usuarios;

    public UsuarioManager() {
        usuarios = new ArrayList<>();
        usuarios.add(new usu("admin", "admin"));
        usuarios.add(new usu("rogger", "julian"));
        usuarios.add(new usu("user2", "password2"));
        // Añadir más usuarios y contraseñas según sea necesario
    }

    public boolean validarUsuario(String nombre, String clave) {
        for (usu usu : usuarios) {
            if (usu.getNombre().equals(nombre) && usu.getClave().equals(clave)) {
                return true;
            }
        }
        return false;
    }

}
