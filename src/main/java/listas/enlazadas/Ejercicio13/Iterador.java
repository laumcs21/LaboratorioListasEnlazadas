package listas.enlazadas.Ejercicio13;

import java.util.Iterator;

public class Iterador implements Iterator<Integer> {

    public NodoLista nodo;
    public Lista lista;
    public int posicion;

    public Iterador(NodoLista nodo, Lista lista) {
        this.nodo = nodo;
        this.lista = lista;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return nodo != null;

    }

    @Override
    public Integer next() {
        int valor = nodo.getDato();
        nodo = nodo.getSig();
        posicion++;
        return valor;
    }

}
