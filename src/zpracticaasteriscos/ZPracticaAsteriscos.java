

package zpracticaasteriscos;

import java.util.Random;


public class ZPracticaAsteriscos {

    
    public static void main(String[] args) {
        int[] numeros = new int[4];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
        }

        Asterisco astrisco = new Asterisco(numeros);
        astrisco.imprimirAsteriscos();
    }
}
 
    


