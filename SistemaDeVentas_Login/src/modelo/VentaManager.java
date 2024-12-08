package modelo;

import java.util.ArrayList;

public class VentaManager {

    private static ArrayList<Ventas> ventas = new ArrayList<>();

    static {
        ventas = new ArrayList<>();
        ventas.add(new Ventas(1, 1, "boleta", "pepito", "78986545", "av. pepito", 987654321, 100.0));
    }

    public static void setVentas(Ventas pedido) {
        ventas.add(pedido);
    }

    public static ArrayList<Ventas> getVentas() {
        return ventas;
    }
}
