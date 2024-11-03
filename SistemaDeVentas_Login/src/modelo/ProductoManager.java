package modelo;

import java.util.ArrayList;

public class ProductoManager {
    private static final ArrayList<Product> productos = new ArrayList<>();

    static {
        productos.add(new Product(1, "Cuaderno","Cuaderno","Cuaderno", 6.00));
        productos.add(new Product(2, "Lapiz", "Lapiz", "Lapiz", 2.00));
        productos.add(new Product(3, "Mochila", "Mochila", "Mochila", 40.00));
    }
    
    public static void setProductos(Product producto) {
        productos.add(producto);
    }

    public static ArrayList<Product> getProductos() {
        return productos;
    }
}
