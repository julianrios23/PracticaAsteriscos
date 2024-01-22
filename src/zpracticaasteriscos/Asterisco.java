package zpracticaasteriscos;

public class Asterisco {

    private int[] numeros;

    public Asterisco(int[] numeros) {
        this.numeros = numeros;
    }

    public void imprimirAsteriscos() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
