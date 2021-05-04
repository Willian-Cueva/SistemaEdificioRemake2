/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Dao;

import Controlador.Lista.ListaSimple;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Willian
 */
public class AdaptadorDao implements Dao<Object, Long> {

    private Conexion conexion;
    private Class clazz;

    public AdaptadorDao(Conexion conexion, Class clazz) {
        this.conexion = conexion;
        this.clazz = clazz;
    }

    @Override
    public boolean insertar(Object t) {
        ListaSimple lista = listar();
        lista.insertar(t);
        lista.presentar();
        try {
            System.out.println(conexion.getxStream().toXML(lista));;
            conexion.getxStream().toXML(lista, new FileOutputStream(conexion.getDireccion() + File.separatorChar + clazz.getSimpleName() + ".json"));
            return true;
        } catch (FileNotFoundException ex) {
            System.err.println("*******\n No se pudo guardar AdaptadorDao-insertart" + ex);
            return false;
//            Logger.getLogger(AdaptadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaSimple listar() {
        ListaSimple lista = new ListaSimple();
        try {
            lista = (ListaSimple) conexion.getxStream().fromXML(new FileReader(conexion.getDireccion() + File.separatorChar + clazz.getSimpleName() + ".json"));
            System.out.println("presentando");
            lista.presentar();
        } catch (FileNotFoundException ex) {
            System.err.println("******\nNo se pudo listar AdaptadorDao-listar\n");
            Logger.getLogger(AdaptadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public Object obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
