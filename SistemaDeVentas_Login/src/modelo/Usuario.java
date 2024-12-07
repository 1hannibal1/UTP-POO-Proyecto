package modelo;

import java.util.Scanner;

    public class Usuario {
    protected String nombre;
    protected String usuario;
    protected String password;

    // Constructor de Usuario
    public Usuario(String nombre, String usuario, String password) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
    }

    /*Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método de login
    public void login() {
        
        Scanner user = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");

        String userText = user.nextLine();
        Scanner password = new Scanner(System.in);
        System.out.println("Ingrese su password:");
        String passwordText = password.nextLine();
        
        if (userText.equals(getUsuario()) && passwordText.equals(getPassword())) {
                System.out.println(getUsuario() + " ha iniciado sesión como " + this.getClass().getSimpleName());
        } else {
            System.out.println("Usuario o password es incorrecto:");
        }
        // Carlos - Mozo, 
    }
}
