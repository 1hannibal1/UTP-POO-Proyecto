package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import javax.persistence.EntityManager;

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
        pedidos.add(pedido);
    }

    public static CollectionCustom<Pedidos> getPedidos() {
        return pedidos;
    }
}
