package listas.enlazadas.Ejercicio13;

public class NodoLista {

    public int dato;
    public NodoLista sig;
    public int clave;

    public NodoLista(int x, NodoLista n) {
        this.dato = x;
        this.sig = n;
        this.clave = x;
    }

    public NodoLista(int x) {
        this.dato = x;
        this.sig = null;
        this.clave = x;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
