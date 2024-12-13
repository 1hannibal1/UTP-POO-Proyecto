package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class PedidosManager {

    private static CollectionCustom<Pedidos> pedidos = new CollectionCustom<>();
    
    public static void inicializarDatos() {
        EntityManager em = JPAUtil.getEntityManager(); // Uso estático, no se instancia JPAUtil
        em.getTransaction().begin();

        Pedidos p1 = new Pedidos(1, 1, 1, 1, 1);
        Pedidos p2 = new Pedidos(2, 1, 2, 2, 1);

        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        em.close();
    }

    public static void setPedidos(Pedidos pedido) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            pedidos.add(pedido);
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

    public static CollectionCustom<Pedidos> getPedidos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Pedidos> query = em.createQuery("SELECT p FROM Pedidos p", Pedidos.class);
            List<Pedidos> resultado = query.getResultList();
            pedidos.clear();
            pedidos.addAll(resultado);
            return pedidos;
        } catch (Exception e) {
            return pedidos;
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
}
