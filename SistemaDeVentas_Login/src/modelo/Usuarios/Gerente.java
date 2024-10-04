package modelo.Usuarios;

import modelo.Usuario;

public class Gerente extends Usuario {
    private String Local; 
    public Gerente(String nombre, String usuario, String password) {
        super(nombre, usuario, password);
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }
    
}
