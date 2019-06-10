
package turnero;

import modelo.turnero.cliente;
import consola.turnero.clienteConsola;

/**
 *
 * @author manue
 */
public class Turnero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clienteConsola servicio = new clienteConsola();
        cliente i;
        
        i = new cliente(1225090595L, "Jaime", "Marin", "Masculino", "centro", "beneficiario");
        servicio.guardarCliente(i);
        System.out.println("Cliente guardado");
        
        i = servicio.consultarCliente(1225090595L);
        System.out.print(i);        
    }
    
}
