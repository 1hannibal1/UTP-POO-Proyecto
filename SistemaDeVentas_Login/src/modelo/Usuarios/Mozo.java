
package modelo.Usuarios;

import modelo.Usuario;

public class Mozo extends Usuario {
    private int mesasAsignadas;
    public Mozo(String nombre, String usuario, String password) {
        super(nombre, usuario, password);
    }

    public int getMesasAsignadas() {
        return mesasAsignadas;
    }

    public void setMesasAsignadas(int mesasAsignadas) {
        this.mesasAsignadas = mesasAsignadas;
    }
}
