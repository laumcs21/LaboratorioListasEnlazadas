package listas.enlazadas.Ejercicio10;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {

    public static void main(String[] args) {

        ListaSimple<Integer> lista1 = new ListaSimple<Integer>();

        lista1.addLast(1);
        lista1.addLast(2);
        lista1.addLast(3);
        lista1.addLast(4);

        ListaSimple<Integer> lista2 = new ListaSimple<Integer>();

        lista2.addLast(5);
        lista2.addLast(6);
        lista2.addLast(7);
        lista2.addLast(8);

        ListaSimple<Integer> lista = concatenarListasSimples(lista1, lista2);

        Nodo<Integer> aux = lista.getNodoPrimero();

        while (aux != null){
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }

        
        
    }

    public static ListaSimple<Integer> concatenarListasSimples(ListaSimple<Integer> lista1, ListaSimple<Integer> lista2){

        if(lista1.getNodoPrimero() == null){
            return lista2;
        }

        if(lista2.getNodoPrimero() == null){
            return lista1;
        }

        Nodo<Integer> aux = lista1.getNodoPrimero();

        

        while (aux.getNodoSiguiente() != null){
            aux = aux.getNodoSiguiente();
        }

        aux.setNodoSiguiente(lista2.getNodoPrimero());

        return lista1;

    }
    
}
