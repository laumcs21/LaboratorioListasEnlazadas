package listas.enlazadas.Ejercicio1;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple<>();

        lista.addFirst("3");
        lista.addFirst("4");
        lista.addLast("7");
        lista.addFirst("9");
        lista.addFirst("0");

        Nodo<Integer> aux = lista.getNodoPrimero();

        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }

        ObtenerPosicionesImpares(lista);

    }

    public static void ObtenerPosicionesImpares(ListaSimple<Integer> lista) {
        Nodo<Integer> aux = lista.getNodoPrimero();
        int i = 0;
        for (; aux != null; aux = aux.getNodoSiguiente(), i++) {
            if (i % 2 != 1)
                continue;

            System.out.println("Posición " + i + ": " + aux.getDato());
        }
    }
}
