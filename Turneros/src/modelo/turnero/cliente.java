
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
@Table(name = "users")
public class cliente {
    @Id
    private Long identificacion;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String tipoAfiliacion;
    
    public cliente() {
    }

    public cliente(Long identificacion, String nombre, String apellido, String genero, String direccion, String tipoAfiliacion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }
    
    @Override
    public String toString() {
        return "Identificacion: " + identificacion + "\nNombre: " + nombre + "\nApellido: " + apellido
                + "\ngenero: " + genero+"\nDireccion: "+direccion + "\nTipo de afiliacion: "+ tipoAfiliacion;
    }
}
