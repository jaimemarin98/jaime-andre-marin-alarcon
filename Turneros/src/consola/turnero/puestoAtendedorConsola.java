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
import modelo.turnero.puestoAtendedor;
/**
 *
 * @author jaimeandres
 */
public class puestoAtendedorConsola {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("turneroPU");
    
     private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public puestoAtendedor guardarPuntoAtencion(puestoAtendedor puestoAtendedor) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        puestoAtendedor = em.merge(puestoAtendedor);

        em.getTransaction().commit();
        em.close();
        return puestoAtendedor;
    }

    public List<puestoAtendedor> listarPuntoAtencion() {
        EntityManager em = getEntityManager();

        Query query = em.createQuery("SELECT u FROM Atencion u");
        List<puestoAtendedor> resp = (List<puestoAtendedor>) query.getResultList();

        em.close();
        return resp;
    }

    public puestoAtendedor consultarPuntoAtencion(Long identificador) {
        EntityManager em = getEntityManager();

        puestoAtendedor resp = em.find(puestoAtendedor.class, identificador);

        em.close();
        return resp;
    }
}
