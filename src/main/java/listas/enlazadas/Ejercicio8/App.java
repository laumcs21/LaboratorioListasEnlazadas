package listas.enlazadas.Ejercicio8;

import listas.enlazadas.ListaDoble;
import listas.enlazadas.NodoDoble;

public class App {

    public static void main(String[] args) {

        ListaDoble<Persona> lista = new ListaDoble<Persona>();

        lista.agregarfinal(new Persona("Juanita", "12545"));
        lista.agregarfinal(new Persona("Pedro", "255446"));
        lista.agregarfinal(new Persona("Ramon", "99855"));
        lista.agregarfinal(new Persona("Santiago", "2554"));

        ListaDoble<Persona> cedulasPares = obtenerPersonasCedulaPar(lista);


        NodoDoble<Persona> aux = cedulasPares.getNodoPrimero();
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getNodoSiguiente();
        }

        
    }

    public static ListaDoble<Persona> obtenerPersonasCedulaPar(ListaDoble<Persona> lista) {
        ListaDoble<Persona> resultado = new ListaDoble<>();
        NodoDoble<Persona> aux = lista.getNodoPrimero();
        int i = 0;

        for (; aux != null; aux = aux.getNodoSiguiente(), i++) {

            Persona persona = aux.getDato();
            String cedula = persona.getCedula();

            if (cedula.length() % 2 == 1) {
                continue;
            }

            resultado.agregarfinal(persona);

        }
        return resultado;

    }
    
}
