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
import modelo.turnero.turno;
/**
 *
 * @author jaimeandres
 */
public class turnoConsola {
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("turneroPU");
    
     private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public turno guardarTurno(turno turno) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        turno = em.merge(turno);

        em.getTransaction().commit();
        em.close();
        return turno;
    }

    public List<turno> listarTurno() {
        EntityManager em = getEntityManager();

        Query query = em.createQuery("SELECT u FROM Atencion u");
        List<turno> resp = (List<turno>) query.getResultList();

        em.close();
        return resp;
    }

    public turno consultarTurno(Long identificador) {
        EntityManager em = getEntityManager();

        turno resp = em.find(turno.class, identificador);

        em.close();
        return resp;
    }
}
