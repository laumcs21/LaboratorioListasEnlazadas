package listas.enlazadas.Ejercicio2;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {


    public static void main(String[] args) {

        ListaSimple<Persona> lista = new ListaSimple<Persona>();

        lista.addFirst(new Persona("Juancho", "102383"));
        lista.addFirst(new Persona("Pedro", "125442"));
        lista.addFirst(new Persona("Roman", "12365"));
        lista.addFirst(new Persona("Maria", "78554"));
        lista.addFirst(new Persona("Sofia", "1023584"));

        ListaSimple<Persona> cedulasPares = obtenerPersonasCedulaPar(lista);

        Nodo<Persona> aux = cedulasPares.getNodoPrimero();
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }

    }

    public static ListaSimple<Persona> obtenerPersonasCedulaPar(ListaSimple<Persona> lista) {
        ListaSimple<Persona> resultado = new ListaSimple<>();
        Nodo<Persona> aux = lista.getNodoPrimero();
        int i = 0;

        for (; aux != null; aux = aux.getNodoSiguiente(), i++) {

            Persona persona = aux.getDato();
            String cedula = persona.getCedula();

            if (cedula.length() % 2 == 1) {
                continue;
            }

            resultado.addFirst(persona);

        }
        return resultado;

    }

}
