package listas.enlazadas;

public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> nodoSiguiente;
    private NodoDoble<T> nodoAnterior;

    public NodoDoble(T dato) {

        this.dato = dato;
    }

    public NodoDoble(T dato, NodoDoble<T> siguiente) {
        super();
        this.dato = dato;
        this.nodoSiguiente = siguiente;
    }

    public NodoDoble(T dato, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
        super();
        this.dato = dato;
        this.nodoSiguiente = siguiente;
        this.nodoAnterior = anterior;
    }

    public T getDato() {

        return dato;
    }

    public NodoDoble<T> getNodoSiguiente() {

        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoDoble<T> nodoSiguiente) {

        this.nodoSiguiente = nodoSiguiente;
    }

    public void setDato(T dato) {

        this.dato = dato;
    }

    public NodoDoble<T> getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoDoble<T> nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
}