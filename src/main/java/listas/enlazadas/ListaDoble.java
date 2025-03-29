package listas.enlazadas;

import java.util.Iterator;

import listas.enlazadas.Ejercicio7.IteradorListaDoble;

public class ListaDoble<T> implements Iterable<T> {
    private int tamano;
    private NodoDoble<T> nodoPrimero;
    private NodoDoble<T> nodoUltimo;

    public ListaDoble() {
        this.tamano = 0;
        this.nodoPrimero = null;
        this.nodoUltimo = null;
    }

    public int getTamano() {

        return tamano;
    }

    public void setTamano(int tamano) {

        this.tamano = tamano;
    }

    public NodoDoble<T> getNodoPrimero() {
        return nodoPrimero;
    }

    public void setNodoPrimero(NodoDoble<T> nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }

    public NodoDoble<T> getNodoUltimo() {
        return nodoUltimo;
    }

    public void setNodoUltimo(NodoDoble<T> nodoUltimo) {
        this.nodoUltimo = nodoUltimo;
    }

    public void agregarInicio(T valorNodo) {

        NodoDoble<T> nuevoNodo = new NodoDoble<>(valorNodo);

        if (isEmpty()) {
            nodoPrimero = nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(nodoPrimero);
            nodoPrimero = nuevoNodo;
        }
        tamano++;
    }

    // Agregar al final de la lista
    public void agregarfinal(T valorNodo) {

        NodoDoble<T> nuevoNodo = new NodoDoble<>(valorNodo);

        if (isEmpty()) {
            nodoPrimero = nodoUltimo = nuevoNodo;
        } else {
            nodoUltimo.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoAnterior(nodoUltimo);
            nodoUltimo = nuevoNodo;
        }
        tamano++;
    }

    public boolean isEmpty() {
        boolean vacio = false;
        if (tamano == 0) {
            vacio = true;
        }
        return vacio;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaDoble(nodoPrimero);
    }
}
