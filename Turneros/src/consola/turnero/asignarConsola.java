/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola.turnero;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.turnero.asignar;

/**
 *
 * @author jaimeandres
 */
public class asignarConsola {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("turneroPU");
    
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public asignar guardarAsesor(asignar asignar) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        asignar = em.merge(asignar);

        em.getTransaction().commit();
        em.close();
        return asignar;
    }

    public List<asignar> listarAsesor() {
        EntityManager em = getEntityManager();

        Query query = em.createQuery("SELECT u FROM Asignar u");
        List<asignar> resp = (List<asignar>) query.getResultList();

        em.close();
        return resp;
    }

    public asignar consultarAsesor(Long identificador) {
        EntityManager em = getEntityManager();

        asignar resp = em.find(asignar.class, identificador);

        em.close();
        return resp;
    }
}
