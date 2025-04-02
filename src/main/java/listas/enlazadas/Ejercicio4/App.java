package listas.enlazadas.Ejercicio4;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {
    

    public static void main(String[] args) {

        ListaSimple<Integer> lista = new ListaSimple<Integer>();

        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(6);
        lista.addFirst(4);
        lista.addFirst(7);

        ListaSimple<Integer> valoresImpares = obtenerValoresImpares(lista);

        Nodo<Integer> aux = valoresImpares.getNodoPrimero();
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }


        
    }

    public static ListaSimple<Integer> obtenerValoresImpares(ListaSimple<Integer> lista){
        ListaSimple<Integer> resultado = new ListaSimple<>();
        Nodo<Integer> aux = lista.getNodoPrimero();
        int i = 0;

        for(; aux != null; aux = aux.getNodoSiguiente(), i++){

            int dato = aux.getDato();
            
            if (dato % 2 == 0){
            continue;
            }

            resultado.addFirst(dato);
            
        }
        return resultado;

    }
}
