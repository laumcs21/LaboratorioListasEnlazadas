package listas.enlazadas.Ejercicio6;

import listas.enlazadas.ListaDoble;
import listas.enlazadas.NodoDoble;

public class App {

    public static void main(String[] args) {
        
        ListaDoble<Integer> lista = new ListaDoble<Integer>();

       lista.agregarfinal(1);
       lista.agregarfinal(2);
       lista.agregarfinal(3);
       lista.agregarfinal(4);
       lista.agregarfinal(5);

        imprimirHaciaAtras(lista);


    }

    public static void imprimirHaciaAtras(ListaDoble<Integer> lista){
        NodoDoble<Integer> actual = lista.getNodoUltimo();

        while(actual != null){
            System.out.println(actual.getDato());
            actual = actual.getNodoAnterior();
        }

    }
    
}
