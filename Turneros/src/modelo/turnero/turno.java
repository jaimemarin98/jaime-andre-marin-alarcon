
package modelo.turnero;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jaimeandres
 */
@Entity
@Table(name = "turno")
public class turno {
    @Id
    private String codigo;
    @Column(nullable = false)
    private String numTurno;
    @Column(nullable = false)
    private String fecha;
    @Column(nullable = false)
    private String prioridad;

    public turno() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codTurno) {
        this.codigo = codigo;
    }

    public String getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(String numTurno) {
        this.numTurno = numTurno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}

