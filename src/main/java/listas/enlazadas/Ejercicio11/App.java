package listas.enlazadas.Ejercicio11;

public class App {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();

        polinomio.AgregarTermino(3, 4);
        polinomio.AgregarTermino(-4, 2);
        polinomio.AgregarTermino(11, 0);

        for (double i = 0; i <= 5; i = i + 0.5) {
            System.out.println("x = " + i + "| y = " + polinomio.evaluar(i));
        }

    }
}
