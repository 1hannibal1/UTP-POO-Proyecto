package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioManager {

    public class Login extends Usuario {
        public Login(String nombre, String usuario, String password) {
            super(nombre, usuario, password);
        }
        
        public void login() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su usuario:");
            
            String usuarioText = scanner.nextLine();
            
        }
    }
    
    public class Mozo extends Usuario {
    private int mesasAsignadas;
    public Mozo(String nombre, String usuario, String password, int mesasAsignadas) {
        super(nombre, usuario, password);
        this.mesasAsignadas = mesasAsignadas;
    }
}
    // Clase Gerente que hereda de Usuario
    public class Gerente extends Usuario {
    private String Local; 
    public Gerente(String nombre, String usuario, String password, String Local) {
        super(nombre, usuario, password);
        this.Local = Local;
    }

}
    // Clase Cajero que hereda de Usuario
    public class Cajero extends Usuario {
    private int NumeroCaja;
    public Cajero(String nombre, String usuario, String password, int NumeroCaja) {
        super(nombre, usuario, password);
        this.NumeroCaja = NumeroCaja;
    }
    }
}
    
