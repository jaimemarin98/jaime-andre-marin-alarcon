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
import modelo.turnero.servicios;
/**
 *
 * @author jaimeandres
 */
public class servicioConsola {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("turneroPU");
    
     private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public servicios guardarServicios(servicios servicios) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        servicios = em.merge(servicios);

        em.getTransaction().commit();
        em.close();
        return servicios;
    }

    public List<servicios> listarServicios() {
        EntityManager em = getEntityManager();

        Query query = em.createQuery("SELECT u FROM Atencion u");
        List<servicios> resp = (List<servicios>) query.getResultList();

        em.close();
        return resp;
    }

    public servicios consultarServicios(Long identificador) {
        EntityManager em = getEntityManager();

        servicios resp = em.find(servicios.class, identificador);

        em.close();
        return resp;
    }
}
