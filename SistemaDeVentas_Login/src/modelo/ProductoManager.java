package modelo;

import java.util.ArrayList;

public class ProductoManager {
    private static final ArrayList<Productos> productos;

    static {
        productos = new ArrayList<>();
        productos.add(new Productos(1, "Bebidas1", 10, "Bebidas", "Bebidas1"));
        productos.add(new Productos(2, "Bebidas2", 20, "Bebidas", "Bebidas2"));
        productos.add(new Productos(3, "PolloBrasa1", 30, "PolloBrasa", "PolloBrasa1"));
        productos.add(new Productos(4, "PolloBrasa2", 40, "PolloBrasa", "PolloBrasa2"));
        productos.add(new Productos(5, "Piqueos1", 50, "Piqueos", "Piqueos1"));
        productos.add(new Productos(6, "Piqueos2", 60, "Piqueos", "Piqueos2"));
        productos.add(new Productos(7, "Complementos1", 70, "Complementos", "Complementos1"));
        productos.add(new Productos(8, "Complementos2", 80, "Complementos", "Complementos2"));
        productos.add(new Productos(9, "CarnesParrillas1", 90, "CarnesParrillas", "CarnesParrillas1"));
        productos.add(new Productos(10, "CarnesParrillas2", 100, "CarnesParrillas", "CarnesParrillas2"));
    }

    public static ArrayList<Productos> getProductos() {
        return productos;
    }
}
