package listas.enlazadas.Ejercicio12;

import java.io.IOException;
import java.util.ArrayList;

import listas.enlazadas.ListaSimple;
import listas.enlazadas.Nodo;

public class Persistencia {

    // Ruta fija del archivo .txt donde se guardarán los números
    private final String rutaArchivo = "src\\main\\java\\listas\\enlazadas\\Numeros.txt";
    ListaSimple<Double> lista = new ListaSimple<Double>();

    // Guarda una lista enlazada de números en el archivo
    public void guardarNumeros(ListaSimple<Double> lista) throws IOException {
        StringBuilder contenido = new StringBuilder();
        Nodo<Double> aux = lista.getNodoPrimero();

        while (aux != null) {
            contenido.append(aux.getDato()).append("\n");
            aux = aux.getNodoSiguiente();
        }

        ArchivoUtil.guardarArchivo(rutaArchivo, contenido.toString(), false);
    }

    // Carga números desde el archivo y los almacena en una lista enlazada
    public ListaSimple<Double> cargarNumeros() throws IOException {
        ListaSimple<Double> lista = new ListaSimple<>();
        ArrayList<String> lineas = ArchivoUtil.leerArchivo(rutaArchivo);

        for (String linea : lineas) {
            try {
                double numero = Double.parseDouble(linea.trim());
                lista.addLast(numero);
            } catch (NumberFormatException e) {
                System.err.println("Línea inválida (no es número): " + linea);
            }
        }

        return lista;
    }
}




