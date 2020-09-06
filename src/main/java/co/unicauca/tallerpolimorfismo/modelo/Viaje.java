/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 * @author Josman Santiago Muñoz Mera 104617012098
 *         Juan José López Guzman 104617010731
 */
public abstract class Viaje {

    private String origen;
    private String destino;
    private int costo;
    private Date fechaSalida;
    private Date fechaLlegada;
//Constructor de la clase viaje

    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
//getters y setters de la  clase viaje

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public abstract String descripcion();
//Procedimientos de la clase viaje 

    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }

    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }

}
