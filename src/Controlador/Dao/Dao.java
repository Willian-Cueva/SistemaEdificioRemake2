/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Dao;

import Controlador.Lista.ListaSimple;

/**
 *
 * @author Willian
 */
public interface Dao<T,K> {
    boolean insertar(T t);
    void modificar(T t);
    void eliminar(T t);
    ListaSimple listar();
    T obtener(K id);
}
