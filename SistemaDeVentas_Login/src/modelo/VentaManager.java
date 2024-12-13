package modelo;

import interfaces.CollectionCustom;
import interfaces.JPAUtil;
import javax.persistence.EntityManager;

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
        ventas.add(pedido);
    }

    public static CollectionCustom<Ventas> getVentas() {
        return ventas;
    }
}
