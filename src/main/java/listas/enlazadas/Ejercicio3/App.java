package listas.enlazadas.Ejercicio3;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<Integer>();

        lista.addFirst(3);
        lista.addFirst(4);
        lista.addLast(7);
        lista.addFirst(9);
        lista.addFirst(0);
        lista.addLast(2);

        Nodo<Integer> aux = lista.getNodoPrimero();

        while (aux != null) {
            System.out.println("Lista sin eliminar pares: ");
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }

        EliminarNumerosPares(lista);

        aux = lista.getNodoPrimero();

        while (aux != null) {
            System.out.println("Lista eliminando pares: ");
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }

    }

    public static void EliminarNumerosPares(ListaSimple<Integer> lista) {
        Nodo<Integer> aux = lista.getNodoPrimero();
        Nodo<Integer> previo = null;
        Nodo<Integer> siguiente = null;
        int i = 0;
        for (; aux != null; aux = aux.getNodoSiguiente(), i++) {
            siguiente = aux.getNodoSiguiente();

            if (aux.getDato() % 2 != 1) {
                if (aux == lista.getNodoPrimero()) {
                    lista.setNodoPrimero(siguiente);
                } else {
                    previo.setNodoSiguiente(siguiente);
                }
                if (aux == lista.getNodoUltimo()) {
                    lista.setNodoUltimo(previo);
                }
            }
            previo = aux;
        }
    }
}
