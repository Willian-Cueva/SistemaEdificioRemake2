/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import java.util.ArrayList;

/**
 *
 * @author Willian
 */
public interface InterfaceDao<T,K> {
    public boolean insertar(T t);
    public boolean eliminar(T t);
    public void modificar(T t);
    public void extraer(K k);
    public ArrayList<T> listar();
}
