/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import Modelo.Cuenta;

/**
 *
 * @author Willian
 */
public class CuentaDao extends AdaptadorDao{
    private Cuenta cuenta;

    public CuentaDao() {
        super(new Coneccion(), Cuenta.class);
    }
    
    public boolean guargar(){
        if (cuenta.getClave().isEmpty()||cuenta.getUsario().isEmpty())return false;
        else return this.insertar(cuenta);
    }

    public Cuenta getCuenta() {
        if(cuenta==null){
            cuenta = new Cuenta();
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
