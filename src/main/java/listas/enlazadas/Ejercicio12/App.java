package listas.enlazadas.Ejercicio12;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class App {
    
    public static void main(String[] args) {

        Persistencia persistencia = new Persistencia();

        try {
            ListaSimple<Double> lista = persistencia.cargarNumeros();

            lista.imprimir();
            lista.addLast(5.0);
            lista.addLast(6.1);
            lista.addLast(9.5);

            persistencia.guardarNumeros(lista);

            Double media = media(lista);
            System.out.println("Media= "+media);

            Double desviacionEstandar =desviacionEstandar(lista, media);
            System.out.println("Desviacion Estandar= "+desviacionEstandar);


        } catch (Exception e) {
            e.printStackTrace();
            
        }
       
        
    }

    public static Double media(ListaSimple<Double> lista){

        Nodo<Double> aux = lista.getNodoPrimero();
        Double total = 0.0;

        while (aux != null){
            total += aux.getDato();
            aux = aux.getNodoSiguiente();
        }

        return total / lista.getTamano();

    }

    public static Double desviacionEstandar(ListaSimple<Double> lista, Double media){
        Nodo<Double> aux = lista.getNodoPrimero();
        Double suma = 0.0;

        while (aux != null){
            suma += Math.pow(aux.getDato()-media, 2);
            aux = aux.getNodoSiguiente();
        }

        return Math.sqrt(suma / (lista.getTamano() -1));
    }
}
