/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Willian
 */
public class AdaptadorDao implements InterfaceDao<Object, Long> {

    final private Coneccion coneccion;
    final private Class clazz;

    public AdaptadorDao(Coneccion Coneccion, Class clazz) {
        this.coneccion = Coneccion;
        this.clazz = clazz;
    }

    public Coneccion getConeccion() {
        return coneccion;
    }

    public Class getClazz() {
        return clazz;
    }

    public boolean say_hi() {
        return true;
    }

    public boolean say_hi(int s) {
        return true;
    }

    public boolean raton() {
        return true;
    }

    private boolean estaVacio() {
        File archivo = new File(coneccion.getREPO() + File.separatorChar + clazz.getSimpleName() + ".json");
        return archivo.length() == 0;
    }

    @Override
    public boolean insertar(Object t) {
        ArrayList<Object> lista = new ArrayList();
        lista.add(t);
        System.out.println(lista);
        try {
            System.out.println(coneccion.getxStream().toXML(t));
            coneccion.getxStream().toXML(t, new FileOutputStream(coneccion.getREPO() + File.separatorChar + clazz.getSimpleName() + ".json"));
        } catch (FileNotFoundException ex) {
            System.err.println("No se encontro el archivo " + clazz.getSimpleName() + ".json en la direccion especificada " + ex);
//            Logger.getLogger(AdaptadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    @Override
    public boolean eliminar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extraer(Long k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> lista = new ArrayList<>();
        if (!estaVacio()) {
            try {
                lista = (ArrayList<Object>) coneccion.getxStream().fromXML(new FileReader(coneccion.getREPO() + File.separatorChar + clazz.getSimpleName() + ".json"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdaptadorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

}
