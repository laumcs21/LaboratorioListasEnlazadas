package listas.enlazadas;

import java.util.Iterator;

public class ListaSimple<T> implements Iterable<T> {

    private int tamano;
    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;

    public ListaSimple() {
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

    public Nodo<T> getNodoPrimero() {
        return nodoPrimero;
    }

    public void setNodoPrimero(Nodo<T> nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }

    public Nodo<T> getNodoUltimo() {
        return nodoUltimo;
    }

    public void setNodoUltimo(Nodo<T> nodoUltimo) {
        this.nodoUltimo = nodoUltimo;
    }

    public void addFirst(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (isEmpty()) {
            nodoPrimero = nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(nodoPrimero);
            nodoPrimero = nuevoNodo;
        }
        tamano++;
    }

    public void addLast(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (tamano == 0) {
            nodoPrimero = nodoUltimo = nuevoNodo;
        } else {
            nodoUltimo.setNodoSiguiente(nuevoNodo);
            nodoUltimo = nuevoNodo;
        }
        tamano++;
    }

    public void add(int posicion, T dato) {
        if (posicion < 0 || posicion > tamano) {
            throw new IndexOutOfBoundsException("Posición inválida.");
        }
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (tamano == 0 || posicion == 0) {
            nuevoNodo.setNodoSiguiente(nodoPrimero);
            nodoPrimero = nuevoNodo;
            if (tamano == 0) {
                nodoUltimo = nuevoNodo;
            }
        } else {
            Nodo<T> aux = nodoPrimero;
            int contador = 0;

            while (contador < posicion - 1) {
                aux = aux.getNodoSiguiente();
                contador++;
            }
            nuevoNodo.setNodoSiguiente(aux.getNodoSiguiente());
            aux.setNodoSiguiente(nuevoNodo);

            if (nuevoNodo.getNodoSiguiente() == null) {
                nodoUltimo = nuevoNodo;
            }
        }
        tamano++;
    }

    public T getValorNodo(int posicion) {
        if (posicion < 0 || posicion > tamano) {
            throw new IndexOutOfBoundsException("Posición inválida.");
        }
        Nodo<T> aux = nodoPrimero;
        int contador = 0;

        while (contador < posicion) {
            aux = aux.getNodoSiguiente();
            contador++;
        }
        return aux.getDato();
    }

    public Nodo<T> getNodo(int posicion) {
        if (posicion < 0 || posicion > tamano) {
            throw new IndexOutOfBoundsException("Posición inválida.");
        }
        Nodo<T> aux = nodoPrimero;
        int contador = 0;

        while (contador < posicion) {
            aux = aux.getNodoSiguiente();
            contador++;
        }
        return aux;
    }

    public int getPosicionNodo(T dato) {
        int i = 0;
        for (Nodo<T> aux = nodoPrimero; aux != null; aux = aux.getNodoSiguiente()) {
            if (aux.getDato().equals(dato)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean indiceValido(int indice) {
        boolean valido = false;
        if (indice < tamano && indice >= 0) {
            valido = true;
        }
        return valido;
    }

    public void eliminarUltimo() {
        if (nodoPrimero == null) {
            return;
        }
    }

    public boolean isEmpty() {
        boolean vacio = false;
        if (tamano == 0) {
            vacio = true;
        }
        return vacio;
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
    
        Nodo<T> aux = nodoPrimero;
        System.out.print("Lista: ");
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getNodoSiguiente();
        }
        System.out.println(); 
    }
    

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
