package modelo;

import java.util.ArrayList;

public class UsuarioManager {

    private static final ArrayList<Usuario> usuarios;

    static {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("1", "admin", "admin"));
        usuarios.add(new Usuario("2", "user", "password"));
    }

    public boolean validarUsuario(String nombre, String clave) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getClave().equals(clave)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Usuario> getUsuario() {
        return usuarios;
    }
}
