package modelo;

import interfaces.CollectionCustom;
import java.util.ArrayList;

public class ProductoManager {
    private static CollectionCustom<Productos> productos = new CollectionCustom<>();

    static {
        productos.add(new Productos(1, "Bebidas1", 10.0, "Bebidas", "Bebidas1"));
        productos.add(new Productos(2, "Bebidas2", 20.0, "Bebidas", "Bebidas2"));
        productos.add(new Productos(3, "PolloBrasa1", 30.0, "Piqueos", "PolloBrasa1"));
    }
    
    public static void setProductos(Productos producto) {
        productos.add(producto);
    }

    public static CollectionCustom<Productos> getProductos() {
        return productos;
    }
    
    public static Productos buscarProductoPorCodigo(int codigoBuscado) {
        return productos.stream() // productos es la instancia de CollectionCustom
            .filter(producto -> producto.getCodigo() == codigoBuscado)
            .findFirst()
            .orElse(null);
    }
    
    public static Productos buscarProductoPorNombreYCategoria(String nombreBuscado, String categoriaBuscada) {
        return productos.stream()
                .filter(producto -> producto.getNombre().equalsIgnoreCase(nombreBuscado) &&
                                    producto.getCategoria().equalsIgnoreCase(categoriaBuscada))
                .findFirst().get();
    }
}
