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
public class asignar {
    @Id
    private String codigoAtencion;
    @Column(nullable = false)
    private String prioridad;
    @Column(nullable = false)
    private String fecha;
    @Column(nullable = false)
    private String horaAtencion;

    public asignar() {
    }

    public String getCodAtencion() {
        return codigoAtencion;
    }

    public void setCodAtencion(String codAtencion) {
        this.codigoAtencion = codigoAtencion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }
}

