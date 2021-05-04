/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Dao.CuentaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class pruebas {
    public static void main(String[] args) {
        CuentaDao c = new CuentaDao();
        
        c.setCuenta(null);
        c.getCuenta().setClave("1234");
        c.getCuenta().setUsuario("cris");
        c.getCuenta().setId(1);
        
        if (c.guardar()) {
            JOptionPane.showMessageDialog(null, "fue guardado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar");
        }
        
    }
}
