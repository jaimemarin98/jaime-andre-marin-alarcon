
package consola.turnero;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.turnero.cliente;
/**
 *
 * @author jaimeandres
 */
public class clienteConsola {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("turneroPU");
    
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public cliente guardarCliente(cliente cliente) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        cliente = em.merge(cliente);

        em.getTransaction().commit();
        em.close();
        return cliente;
    }

    public List<cliente> listarCliente() {
        EntityManager em = getEntityManager();

        Query query = em.createQuery("SELECT u FROM Cliente u");
        List<cliente> resp = (List<cliente>) query.getResultList();

        em.close();
        return resp;
    }

    public cliente consultarCliente(Long identificador) {
        EntityManager em = getEntityManager();

        cliente resp = em.find(cliente.class, identificador);

        em.close();
        return resp;}
}
