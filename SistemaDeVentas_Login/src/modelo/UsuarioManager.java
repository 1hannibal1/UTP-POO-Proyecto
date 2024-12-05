package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Usuarios.Cajero;
import modelo.Usuarios.Gerente;
import modelo.Usuarios.Mozo;

public class UsuarioManager {
    private static Usuario cajero;
    private static Usuario mozo;
    private static Usuario gerente;

    public static boolean validarUsuario(String usuario, String clave){
        System.out.println(usuario);
        System.out.println(clave);
        System.out.println(cajero.usuario);
        if (usuario.equals(cajero.usuario) && clave.equals(cajero.password)) {
            return true;
        }else if(usuario.equals(mozo.usuario) && clave.equals(mozo.password)) {
            return true;
        }else if(usuario.equals(gerente.usuario) && clave.equals(gerente.password)) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void crearUsuario(){
       System.out.println("usuarios creados");
       cajero = new Cajero("Derek", "derek", "123");
       mozo = new Mozo("Sofia", "sofia","456");
       gerente = new Gerente("Vanesa", "vanesa","789");
    }
    
    public static Usuario validarTipoUsuario(Usuario user){
        return new Usuario();
    }
}