package listas.enlazadas.Ejercicio9;

import listas.enlazadas.NodoDoble;

public class ListaDobleCircular<T> {

    private NodoDoble<T> nodoPrimero;
    private NodoDoble<T> nodoUltimo;
    private int tamano;

    public ListaDobleCircular() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamano = 0;
    }

    public void insertar(T valor, int posicion) {
        int cont = 0;

        for (NodoDoble<T> aux = nodoPrimero; cont < tamano; cont++, aux = aux.getNodoSiguiente()) {
            if (cont == posicion) {
                NodoDoble<T> aux2 = aux.getNodoAnterior();
                NodoDoble<T> nuevo = new NodoDoble<>(valor);
                aux2.setNodoSiguiente(nuevo);
                nuevo.setNodoSiguiente(aux);
                nuevo.setNodoAnterior(aux2);
                aux.setNodoAnterior(nuevo);
                tamano++;
            }
        }
    }

    public int buscar(T valor) {
        int cont = 0;
        int pos = -1;

        for (NodoDoble<T> aux = nodoPrimero; cont < tamano; cont++, aux = aux.getNodoSiguiente()) {
            if (aux.getDato().equals(valor)) {
                pos = cont;
            }
        }
        return pos;
    }

    public void agregarFinal(T valorNodo) {

        NodoDoble<T> nuevoNodo = new NodoDoble<>(valorNodo);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(nodoPrimero);
            nodoPrimero.setNodoAnterior(nuevoNodo);
            nodoUltimo.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoAnterior(nodoUltimo);
            nodoPrimero = nuevoNodo;
        }
        tamano++;
    }

    public boolean estaVacia() {
        return nodoPrimero == null && nodoUltimo == null;
    }

    public void imprimirLista() {

        NodoDoble<T> aux = nodoPrimero;
        int cont = 0;

        while (aux != null && cont != tamano) {
            System.out.print(aux.getDato() + "\t");
            aux = aux.getNodoSiguiente();
            cont++;
        }

        System.out.println();
    }

}
