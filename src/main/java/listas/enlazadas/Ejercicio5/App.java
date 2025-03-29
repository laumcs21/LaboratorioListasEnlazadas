package listas.enlazadas.Ejercicio5;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<Integer>();

        lista.addFirst(3);
        lista.addFirst(4);
        lista.addLast(3);
        lista.addFirst(9);
        lista.addFirst(3);
        lista.addLast(2);

        System.out.println(ContarRepeticiones(lista, 3));

    }

    public static int ContarRepeticiones(ListaSimple<Integer> lista, int dato) {
        Nodo<Integer> aux = lista.getNodoPrimero();
        int contador = 0;
        int i = 0;
        for (; aux != null; aux = aux.getNodoSiguiente(), i++) {

            if (aux.getDato() == dato) {
                contador++;
            }
        }
        return contador;
    }
}
