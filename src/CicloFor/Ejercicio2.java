package CicloFor;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 10;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.printf("El numero %d es divisor de %d%n", i, numero);
            }
        }
    }
}
