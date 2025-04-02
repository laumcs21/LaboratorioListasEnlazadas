package listas.enlazadas.Ejercicio13;

import java.util.Iterator;

public class Lista implements Iterable<Integer> {

    public NodoLista inicio;

    public Lista() {
        this.inicio = null;
    }

    public NodoLista getInicio() {
        return inicio;
    }

    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    public void AgregarInicio(int dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        nuevoNodo.setSig(inicio);
        inicio = nuevoNodo;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterador(inicio, this);
    }

}
