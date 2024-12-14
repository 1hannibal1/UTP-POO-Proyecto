package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class PedidosManager {

    private static CollectionCustom<Pedidos> pedidos = new CollectionCustom<>();
    
    public static void inicializarDatos() {
        getPedidos();
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
    
    public static CollectionCustom<Pedidos> filtrarPorCodMesa(int codMesa) {
        CollectionCustom<Pedidos> pedidosFiltrados = new CollectionCustom<>();
        pedidos.stream()
                .filter(pedido -> pedido.getCodMesa() == codMesa)
                .forEach(pedidosFiltrados::add);
        return pedidosFiltrados;
    }
    
}
