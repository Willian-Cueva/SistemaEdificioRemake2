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
public class Usuario {
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String direccion;
    private String correo;
    private String observacion;
    private long idCuenta;
    private long idRol;

    public Usuario(long id, String nombre, String apellido, String cedula, String telefono, String direccion, String correo, String observacion, long idCuenta, long idRol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.observacion = observacion;
        this.idCuenta = idCuenta;
        this.idRol = idRol;
    }

    public Usuario() {
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }
    
    
}
