
package modelo.turnero;

/**
 *
 * @author jaimeandres
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="atendedor")
public class Atendedor {
    @Id
  private String ID;
    @Column(nullable=false, length=50)
  private String nombre;
    @Column(nullable=false, length=11)
  private String Telefono;
    @Column(nullable=false)
  private Integer horario;

    public Atendedor() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }


    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }
}