package listas.enlazadas.Ejercicio13;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();

        NodoLista n7 = new NodoLista(4);
        NodoLista n6 = new NodoLista(4, n7);
        NodoLista n5 = new NodoLista(1, n6);
        NodoLista n9 = new NodoLista(3, n5);
        NodoLista n8 = new NodoLista(5, n9);
        NodoLista n4 = new NodoLista(4, n8);
        NodoLista n3 = new NodoLista(8, n4);
        NodoLista n2 = new NodoLista(6, n3);
        NodoLista n1 = new NodoLista(4, n2);
        NodoLista n = new NodoLista(9, n1);
        lista.setInicio(n);

        NodoLista aux = lista.getInicio();
        System.out.println("Lista: ");

        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSig();
        }

        System.out.println("maxima distancia = " + maximaDistancia(lista.getInicio(), 4, -1, 0, 0));

    }

    public static int maximaDistancia(NodoLista nodo, int clave, int ultimaPosicion, int distanciaMaxima,
            int distanciaActual) {

        if (nodo == null) {
            return distanciaMaxima;
        }

        if (nodo.getClave() == clave) {
            if (ultimaPosicion != -1) {
                int distancia = distanciaActual - ultimaPosicion;
                distanciaMaxima = Math.max(distanciaMaxima, distancia);
            }
            ultimaPosicion = distanciaActual;
        }
        return maximaDistancia(nodo.getSig(), clave, ultimaPosicion, distanciaMaxima, distanciaActual + 1);
    }
}
