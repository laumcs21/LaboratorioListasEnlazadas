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

    public void agregar(T dato, int indice) {

        if (indiceValido(indice)) {

            if (indice == 0) {
                agregarInicio(dato);
            } else {
                NodoDoble<T> nuevo = new NodoDoble<>(dato);
                NodoDoble<T> actual = obtenerNodo(indice);

                nuevo.setNodoSiguiente(actual);
                nuevo.setNodoAnterior(actual.getNodoAnterior());
                actual.getNodoAnterior().setNodoSiguiente(nuevo);
                actual.setNodoAnterior(nuevo);

                tamano++;
            }
        }
    }

    private NodoDoble<T> obtenerNodo(int indice) {

        if (indice >= 0 && indice < tamano) {

            NodoDoble<T> nodo = nodoPrimero;

            for (int i = 0; i < indice; i++) {
                nodo = nodo.getNodoSiguiente();
            }

            return nodo;
        }

        return null;
    }

    public T eliminar(T dato) {

        NodoDoble<T> nodo = buscarNodo(dato);

        if (nodo != null) {

            NodoDoble<T> previo = nodo.getNodoAnterior();
            NodoDoble<T> siguiente = nodo.getNodoSiguiente();

            if (previo == null) {
                nodoPrimero = siguiente;
            } else {
                previo.setNodoSiguiente(siguiente);
            }

            if (siguiente == null) {
                nodoUltimo = previo;
            } else {
                siguiente.setNodoAnterior(previo);
            }

            nodo = null;
            tamano--;

            return dato;
        }

        throw new RuntimeException("El valor no existe");
    }

    private NodoDoble<T> buscarNodo(T dato) {

        NodoDoble<T> aux = nodoPrimero;

        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return aux;
            }
            aux = aux.getNodoSiguiente();
        }

        return null;
    }

    public boolean isEmpty() {
        boolean vacio = false;
        if (tamano == 0) {
            vacio = true;
        }
        return vacio;
    }

    private boolean indiceValido(int indice) {
        if (indice >= 0 && indice < tamano) {
            return true;
        }
        throw new RuntimeException("índice inválido");
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaDoble(nodoPrimero, this);
    }
}
