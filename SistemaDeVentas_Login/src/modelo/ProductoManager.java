package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ProductoManager {
    private static CollectionCustom<Productos> productos = new CollectionCustom<>();
    
    public static void inicializarDatos() {
        ejecutarEnTransaccion(em -> {
            if (productos.isEmpty()) {
                productos.add(new Productos(0, "Bebidas1", 10.0, "Bebidas", "Bebidas1"));
                productos.add(new Productos(1, "Bebidas2", 20.0, "Bebidas", "Bebidas2"));
                productos.add(new Productos(2, "PolloBrasa1", 30.0, "Piqueos", "PolloBrasa1"));
                productos.forEach(em::merge);
            }
        });
    }
    
    public static void setProductos(Productos producto) {
        ejecutarEnTransaccion(em -> {
            productos.add(producto);
            em.persist(producto);
        });
    }

    public static CollectionCustom<Productos> getProductos() {
        ejecutarEnEntidad(em -> {
            TypedQuery<Productos> query = em.createQuery("SELECT p FROM Productos p", Productos.class);
            productos.clear();
            productos.addAll(query.getResultList());
        });
        return productos;
    }
    
    public static boolean updateProducto(Productos newProducto) {
        final boolean[] result = {true};
        ejecutarEnTransaccion(em -> {
            em.merge(newProducto);
            Productos productoSelect = buscarProductoPorCodigo(newProducto.getCodigo());
            if (productoSelect != null) {
                productoSelect.setNombre(newProducto.getNombre());
                productoSelect.setCategoria(newProducto.getCategoria());
                productoSelect.setPrecio(newProducto.getPrecio());
                productoSelect.setDescripcion(newProducto.getDescripcion());
            } else {
                result[0] = false;
            }
        });
        return result[0];
    }
    
    public static Productos buscarProductoPorCodigo(int codigoBuscado) {
        return productos.stream()
            .filter(producto -> producto.getCodigo() == codigoBuscado)
            .findFirst()
            .orElse(null);
    }
    
    public static boolean buscarProductoPorNombreYCategoria(String nombreBuscado, String categoriaBuscada) {
        return productos.stream()
            .anyMatch(producto -> producto.getNombre().equalsIgnoreCase(nombreBuscado) &&
                                  producto.getCategoria().equalsIgnoreCase(categoriaBuscada));
    }

    private static void ejecutarEnTransaccion(EntityAction action) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            action.execute(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error en transacción: " + e.getMessage());
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    private static void ejecutarEnEntidad(EntityAction action) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            action.execute(em);
        } catch (Exception e) {
            System.err.println("Error en operación: " + e.getMessage());
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @FunctionalInterface
    private interface EntityAction {
        void execute(EntityManager em) throws Exception;
    }
}
