/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Willian
 */
public class Factura {
    private long id;
    private float total;
    private String fecha;
    private String hora;
    private long idReservacion;

    public Factura(long id, float total, String fecha, String hora, long idReservacion) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
        this.hora = hora;
        this.idReservacion = idReservacion;
    }

    public Factura() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public long getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(long idReservacion) {
        this.idReservacion = idReservacion;
    }
    
}
