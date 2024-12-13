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
        EntityManager em = JPAUtil.getEntityManager(); // Uso estático, no se instancia JPAUtil
        try {
            em.getTransaction().begin();

            Productos p1 = new Productos(0, "Bebidas1", 10.0, "Bebidas", "Bebidas1");
            Productos p2 = new Productos(1, "Bebidas2", 20.0, "Bebidas", "Bebidas2");
            Productos p3 = new Productos(2, "PolloBrasa1", 30.0, "Piqueos", "PolloBrasa1");

            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
    }
    
    public static void setProductos(Productos producto) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            productos.add(producto);
            em.persist(producto);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
    }

    public static CollectionCustom<Productos> getProductos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Productos> query = em.createQuery("SELECT p FROM Productos p", Productos.class);
            List<Productos> resultado = query.getResultList();
            productos.clear();
            productos.addAll(resultado);
            return productos;
        } catch (Exception e) {
            return productos;
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
    
    public static boolean updateProducto(Productos newProducto) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(newProducto);
            em.getTransaction().commit();
            Productos productoSelect = buscarProductoPorCodigo(newProducto.getCodigo());
            if(productoSelect != null){
                productoSelect.setNombre(newProducto.getNombre());
                productoSelect.setCategoria(newProducto.getCategoria());
                productoSelect.setPrecio(newProducto.getPrecio());
                productoSelect.setDescripcion(newProducto.getDescripcion());
            }
            em.close();
            return true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error al actualizar producto: " + e.getMessage());
            e.printStackTrace();
            em.close();
            return false;
        }
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
