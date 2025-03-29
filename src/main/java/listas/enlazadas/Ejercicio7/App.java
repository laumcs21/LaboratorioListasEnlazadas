package listas.enlazadas.Ejercicio7;

import listas.enlazadas.ListaDoble;

public class App {
    public static void main(String[] args) {
        ListaDoble<Integer> lista = new ListaDoble<Integer>();

        lista.agregarInicio(3);
        lista.agregarInicio(4);
        lista.agregarfinal(3);
        lista.agregarInicio(9);
        lista.agregarInicio(3);
        lista.agregarfinal(2);

        IteradorListaDoble<Integer> iterador = new IteradorListaDoble<Integer>(lista.getNodoPrimero(), lista);

        while (iterador.hasNext()) {
            System.out.println(iterador.next());

        }

    }
}
