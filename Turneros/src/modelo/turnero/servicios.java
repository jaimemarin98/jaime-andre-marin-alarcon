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
public class servicios {
     @Id
    private String codigoServicio;
    @Column(nullable = false)
    private String Llegada;
    @Column(nullable = false)
    private String Salida;

    public servicios() {
    }

    public String getCodServicio() {
        return codigoServicio;
    }

    public void setCodServicio(String codServicio) {
        this.codigoServicio = codServicio;
    }

    public String getHoraLlegada() {
        return Llegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.Llegada = horaLlegada;
    }

    public String getHoraSalida() {
        return Salida;
    }

    public void setHoraSalida(String horaSalida) {
        this.Salida = horaSalida;
    }
}
