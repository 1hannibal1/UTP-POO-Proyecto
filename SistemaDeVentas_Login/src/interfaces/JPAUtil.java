/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class JPAUtil {
    private static EntityManagerFactory EMF  = Persistence.
            createEntityManagerFactory("ProductoUnitPer");
    
    public static EntityManager getEntityManager() {
        EntityManager em = EMF.createEntityManager();
        return em;
    }

    public static void close() {
        if (EMF.isOpen()) {
            EMF.close();
        }
    }
}
