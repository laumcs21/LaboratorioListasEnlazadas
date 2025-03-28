package listas.enlazadas;

public class Nodo<T> {
    private T dato;
    private Nodo<T> nodoSiguiente;

    public Nodo(T dato) {
        this.dato = dato;
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        super();
        this.dato = dato;
        this.nodoSiguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo<T> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}