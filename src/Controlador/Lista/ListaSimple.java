/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Lista;

/**
 *
 * @author Willian
 */
public class ListaSimple {

    protected Nodo cabecera;

    public ListaSimple() {
        cabecera = null;
    }

    private boolean estaVacia() {
        return cabecera == null;
    }

    public void presentar() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo aux = cabecera;
            for (int i = 0; i < tamanio(); i++) {
                System.out.println(aux.getDato());
                aux = aux.getSig();
            }
        }
    }

    public int tamanio() {
        if (estaVacia()) {
            return 0;
        } else {
            int cont = 1;
            Nodo aux = cabecera;
            while (aux.getSig() != null) {
                cont++;
                aux=aux.getSig();
            }
            return cont;
        }
    }

    public void insertar(Object o) {
        if (estaVacia()) {
            System.out.println("La lista esta vacia-insertar");
            Nodo aux = new Nodo(o, null);
            cabecera = aux;
        } else {
            Nodo aux = new Nodo(o, cabecera);
            cabecera=aux;
        }
    }
}
