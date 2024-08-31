package modelo;

import java.util.ArrayList;

public class ProductoManager {
    private static final ArrayList<Productos> productos;

    static {
        productos = new ArrayList<>();
        productos.add(new Productos("1", "Cuaderno", 6.00));
        productos.add(new Productos("2", "Lapiz", 2.00));
        productos.add(new Productos("3", "Mochila", 40.00));
    }

    public static ArrayList<Productos> getProductos() {
        return productos;
    }
}
