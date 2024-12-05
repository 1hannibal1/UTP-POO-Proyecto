package modelo;

import java.util.ArrayList;

public class ProductoManager {
    private static ArrayList<Productos> productos = new ArrayList<>();

    static {
        productos = new ArrayList<>();
        productos.add(new Productos(1, "Bebidas1", 10.0, "Bebidas", "Bebidas1"));
        productos.add(new Productos(2, "Bebidas2", 20.0, "Bebidas", "Bebidas2"));
        productos.add(new Productos(3, "PolloBrasa1", 30.0, "Piqueos", "PolloBrasa1"));
    }
    
    public static void setProductos(Productos producto) {
        productos.add(producto);
    }

    public static ArrayList<Productos> getProductos() {
        return productos;
    }
    
    public static Productos buscarProductoPorCodigo(int codigoBuscado) {
        for (Productos producto : productos) {
            if (producto.getCodigo() == codigoBuscado) {
                return producto; // Retorna el producto si encuentra el código
            }
        }
        return null; // Retorna null si no encuentra el producto
    }
    
    public static Productos buscarProductoPorNombreYCategoria(String nombreBuscado, String categoriaBuscada) {
        return productos.stream()
                .filter(producto -> producto.getNombre().equalsIgnoreCase(nombreBuscado) &&
                                    producto.getCategoria().equalsIgnoreCase(categoriaBuscada))
                .findFirst().get();
    }
}
