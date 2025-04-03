package listas.enlazadas.Ejercicio11;

public class Termino {
    private int coeficiente;
    private int exponente;
    private Termino siguiente;

    public Termino(int coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public Termino getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Termino siguiente) {
        this.siguiente = siguiente;
    }

}
