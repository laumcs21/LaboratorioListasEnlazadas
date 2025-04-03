package listas.enlazadas.Ejercicio7;

import java.util.Iterator;

import listas.enlazadas.ListaDoble;
import listas.enlazadas.NodoDoble;

public class IteradorListaDoble<T> implements Iterator<T> {

    private NodoDoble<T> nodo;
    private int posicion;
    private ListaDoble<T> ListaDoble;

    public IteradorListaDoble(NodoDoble<T> nodo, ListaDoble<T> lista) {
        this.nodo = nodo;
        this.posicion = 0;
        this.ListaDoble = lista;
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

    public void remove() {
        if (nodo != null) {
            ListaDoble.eliminar(nodo.getDato());
        }
    }

    public void set(T e) {
        if (nodo != null) {
            nodo.setDato(e);
        }
    }

    public void add(T e) {
        ListaDoble.agregar(e, posicion);
    }

    public int getPosicion() {
        return posicion;
    }
}
