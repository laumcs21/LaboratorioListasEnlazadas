package listas.enlazadas.Ejercicio11;

public class Polinomio {
    private Termino primero;

    public Polinomio() {
        this.primero = null;
    }

    public Termino getPrimero() {
        return primero;
    }

    public void setPrimero(Termino primero) {
        this.primero = primero;
    }

    public void AgregarTermino(int coeficiente, int exponente) {
        Termino termino = new Termino(coeficiente, exponente);

        if (primero == null) {
            primero = termino;
        } else {
            termino.setSiguiente(primero);
            primero = termino;
        }

    }

    public double evaluar(double x) {
        Termino aux = primero;
        double resultado = 0;
        while (aux != null) {
            resultado = resultado + (aux.getCoeficiente() * Math.pow(x, aux.getExponente()));
            aux = aux.getSiguiente();
        }
        return resultado;
    }

}
