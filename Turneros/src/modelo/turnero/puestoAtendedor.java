/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.turnero;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author jaimeandres
 */
public class puestoAtendedor {
     @Id
    private String numPuesto;
    @Column(nullable = false)
    private String estado;

    public puestoAtendedor() {
    }

    public String getCodPunto() {
        return numPuesto;
    }

    public void setCodPunto(String codPunto) {
        this.numPuesto = numPuesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
