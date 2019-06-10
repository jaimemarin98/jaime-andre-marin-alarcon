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
import modelo.turnero.Atendedor;
/**
 *
 * @author jaimeandres
 */
public class atendedorConsola {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("turneroPU");
    
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Atendedor guardarAsesor(Atendedor Atendedor) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        Atendedor = em.merge(Atendedor);

        em.getTransaction().commit();
        em.close();
        return Atendedor;
    }

    public List<Atendedor> listarAsesor() {
        EntityManager em = getEntityManager();

        Query query = em.createQuery("SELECT u FROM Atendedor u");
        List<Atendedor> resp = (List<Atendedor>) query.getResultList();

        em.close();
        return resp;
    }

    public Atendedor consultarAsesor(Long identificador) {
        EntityManager em = getEntityManager();

        Atendedor resp = em.find(Atendedor.class, identificador);

        em.close();
        return resp;
    }
}
