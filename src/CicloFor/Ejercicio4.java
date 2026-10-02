package CicloFor;

import java.math.BigInteger;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 5;
        int suma = 0;
        BigInteger factorial = BigInteger.ONE;
        int perfecto = 0;

        for (int i = 0; i <= numero; i++) {
            suma += i;
        }
        double raiz = (double) Math.sqrt(suma);
        int aleatorio = (int) (Math.random() * suma) + 1;

        System.out.printf("La suma de los numeros del 0 al %d es: %d%nLa raiz de la suma es: %2.2f%nEl numero aleatorio es: %d%n", numero, suma, raiz, aleatorio);

        for (int i = 1; i <= suma; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            if (numero % i == 0) {
                System.out.printf("El numero %d es divisor de %d%n", i, numero);
                perfecto += i;
            }
        }

        System.out.printf("El factorial de %d es: %s%n", suma, factorial);

        if ((perfecto - suma) == suma) {
            System.out.printf("El numero %d es un numero perfecto%n", numero);
        } else {
            System.out.printf("El numero %d no es un numero perfecto%n", numero);
        }
    }

}
