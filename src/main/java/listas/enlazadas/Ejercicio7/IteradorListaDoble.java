package listas.enlazadas.Ejercicio7;

import java.util.Iterator;

import listas.enlazadas.NodoDoble;

public class IteradorListaDoble<T> implements Iterator<T> {

    private NodoDoble<T> nodo;
    private int posicion;

    public IteradorListaDoble(NodoDoble<T> nodo) {
        this.nodo = nodo;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return nodo != null;
    }

    @Override
    public T next() {
        T valor = nodo.getDato();
        nodo = nodo.getNodoSiguiente();
        posicion++;
        return valor;
    }

    public boolean hasPrevious() {
        return nodo != null;
    }

    public T previous() {
        T aux = nodo.getDato();
        nodo = nodo.getNodoAnterior();
        posicion--;
        return aux;
    }

    public int nextIndex() {
        return posicion;
    }

    public int previousIndex() {
        return posicion - 1;
    }
}
