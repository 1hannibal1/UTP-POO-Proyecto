package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import javax.persistence.EntityManager;

public class ProductoManager {
    private static CollectionCustom<Productos> productos = new CollectionCustom<>();
    
    public static void inicializarDatos() {
        EntityManager em = JPAUtil.getEntityManager(); // Uso estático, no se instancia JPAUtil
        em.getTransaction().begin();

        Productos p1 = new Productos(0, "Bebidas1", 10.0, "Bebidas", "Bebidas1");
        Productos p2 = new Productos(0, "Bebidas2", 20.0, "Bebidas", "Bebidas2");
        Productos p3 = new Productos(0, "PolloBrasa1", 30.0, "Piqueos", "PolloBrasa1");

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit();
        em.close();
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
