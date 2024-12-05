
package modelo.Usuarios;

import modelo.Usuario;

public class Cajero extends Usuario {
    private int NumeroCaja;
    public Cajero(String nombre, String usuario, String password) {
        super(nombre, usuario, password);

    }

    public int getNumeroCaja() {
        return NumeroCaja;
    }

    public void setNumeroCaja(int NumeroCaja) {
        this.NumeroCaja = NumeroCaja;
    }
}