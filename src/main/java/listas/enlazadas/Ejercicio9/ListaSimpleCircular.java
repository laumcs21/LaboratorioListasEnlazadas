package listas.enlazadas.Ejercicio9;

import listas.enlazadas.Nodo;

public class ListaSimpleCircular<T> {

    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int tamano;

    public ListaSimpleCircular() {
        nodoPrimero = null;
        nodoPrimero = null;
        tamano = 0;
    }

    public void agregarInicio(T valorNodo) {

        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);

        if (estaVacia()) {
            nodoPrimero = nuevoNodo;
        } else {
            Nodo<T> aux = nodoUltimo.getNodoSiguiente();
            nodoUltimo.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoSiguiente(aux);
            nodoUltimo = nuevoNodo;
        }
        tamano++;
    }

    public void agregarfinal(T valorNodo) {

        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nuevoNodo;
        } else {
            Nodo<T> aux = nodoUltimo.getNodoSiguiente();
            nodoUltimo.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoSiguiente(aux);
            nodoUltimo = nuevoNodo;
        }
        tamano++;
    }

    public T obtenerValorNodo(int indice) {

        Nodo<T> nodoTemporal = null;
        int contador = 0;

        if (indiceValido(indice)) {
            nodoTemporal = nodoPrimero;

            while (contador < indice) {

                nodoTemporal = nodoTemporal.getNodoSiguiente();
                contador++;
            }
        }

        if (nodoTemporal != null)
            return nodoTemporal.getDato();
        else
            return null;
    }

    private boolean indiceValido(int indice) {
        if (indice >= 0 && indice < tamano) {
            return true;
        }
        throw new RuntimeException("índice inválido");
    }

    public boolean estaVacia() {
        return (nodoPrimero == null) ? true : false;
    }

    public void imprimirLista() {

        Nodo<T> aux = nodoPrimero;

        while (aux != null) {
            System.out.print(aux.getDato() + "\t");
            aux = aux.getNodoSiguiente();
        }

        System.out.println();
    }

    public T eliminar(T dato) {
        Nodo<T> nodo = nodoPrimero;
        Nodo<T> previo = null;
        Nodo<T> siguiente = null;
        boolean encontrado = false;

        while (nodo != null) {
            if (nodo.getDato() == dato) {
                encontrado = true;
                break;
            }
            previo = nodo;
            nodo = nodo.getNodoSiguiente();
        }

        if (encontrado) {
            siguiente = nodo.getNodoSiguiente();
            if (previo == null) {
                nodoPrimero = siguiente;
            } else {
                previo.setNodoSiguiente(siguiente);
            }

            if (siguiente == null) {
                nodoUltimo = previo;
            } else {
                nodo.setNodoSiguiente(null);
            }

            nodo = null;
            tamano--;
            return dato;
        }
        throw new RuntimeException("El elemento no existe");
    }

    public T eliminarPrimero() {

        if (!estaVacia()) {
            Nodo<T> n = nodoPrimero;
            T valor = n.getDato();
            nodoPrimero = n.getNodoSiguiente();

            if (nodoPrimero == null) {
                nodoUltimo = null;
            }

            tamano--;
            return valor;
        }

        throw new RuntimeException("Lista vacía");
    }

    public T eliminarUltimo() {

        if (!estaVacia()) {
            T valor = nodoUltimo.getDato();
            Nodo<T> prev = obtenerNodo(tamano - 2);
            nodoUltimo = prev;

            if (nodoUltimo == null) {
                nodoPrimero = null;
            } else {
                prev.setNodoSiguiente(null);
            }

            tamano--;
            return valor;
        }

        throw new RuntimeException("Lista vac�a");
    }

    private Nodo<T> obtenerNodo(int indice) {

        if (indice >= 0 && indice < tamano) {

            Nodo<T> nodo = nodoPrimero;

            for (int i = 0; i < indice; i++) {
                nodo = nodo.getNodoSiguiente();
            }

            return nodo;
        }

        return null;
    }

}
