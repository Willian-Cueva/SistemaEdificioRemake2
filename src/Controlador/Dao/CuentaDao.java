/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Dao;

import Modelo.Cuenta;

/**
 *
 * @author Willian
 */
public class CuentaDao extends AdaptadorDao {

    private Cuenta cuenta;

    public boolean guardar() {
        Cuenta aux = new Cuenta(cuenta.getId(), cuenta.getUsuario(), cuenta.getClave());
        return this.insertar(aux);
    }

    public CuentaDao() {
        super(new Conexion(), Cuenta.class);
    }

    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta=new Cuenta();
        }
        return cuenta;

    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
