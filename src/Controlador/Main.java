/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.ControladorDao.CuentaDao;

/**
 *
 * @author Willian
 */
public class Main {
    public static void main(String[] args) {
        CuentaDao c = new CuentaDao();
        
        c.setCuenta(null);
        c.getCuenta().setId(2);
        c.getCuenta().setUsario("Willian");
        c.getCuenta().setClave("1234");
        
        if (c.guargar()) {
            System.out.println("Se guardo con exito");
        } else {
            System.out.println("No Se pudo guargar");
        }
        
    }
}
