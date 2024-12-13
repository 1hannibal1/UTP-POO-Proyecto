package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class VentaManager {

    private static CollectionCustom<Ventas> ventas = new CollectionCustom<>();
    
    public static void inicializarDatos() {
        EntityManager em = JPAUtil.getEntityManager(); // Uso estático, no se instancia JPAUtil
        em.getTransaction().begin();

        Ventas v1 = new Ventas(1, 1, "boleta", "pepito", "78986545", "av. pepito", 987654321, 100.0);

        em.persist(v1);
        em.getTransaction().commit();
        em.close();
    }

    public static void setVentas(Ventas pedido) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            ventas.add(pedido);
            em.persist(pedido);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
    }

    public static CollectionCustom<Ventas> getVentas() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Ventas> query = em.createQuery("SELECT p FROM Ventas p", Ventas.class);
            List<Ventas> resultado = query.getResultList();
            ventas.clear();
            ventas.addAll(resultado);
            return ventas;
        } catch (Exception e) {
            return ventas;
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
}
