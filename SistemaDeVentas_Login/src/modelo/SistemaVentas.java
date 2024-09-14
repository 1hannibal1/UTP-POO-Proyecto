
package modelo;

public class SistemaVentas {

    public static void main(String[] args) {
        UsuarioManager usuarioManager = new UsuarioManager();
       // Crear instancias de las clases
        UsuarioManager.Mozo mozo = usuarioManager.new Mozo("Carlos", "carlos_mozo", "password123", 1);
        UsuarioManager.Gerente gerente = usuarioManager.new Gerente("Laura", "laura_gerente", "password456","SJL");
        UsuarioManager.Cajero cajero = usuarioManager.new Cajero("Ana", "ana_cajero", "password789",3);


        mozo.login();
       // System.out.println("El nombre del mozo es: " + mozo.getNombre());

        //mozo.setNombre("Carlos Pérez");
        //System.out.println("El nuevo nombre del mozo es: " + mozo.getNombre());

        //gerente.login();
        //System.out.println("El nombre del gerente es: " + gerente.getNombre());

        //cajero.login();
        //System.out.println("El nombre del cajero es: " + cajero.getNombre());
    }
}