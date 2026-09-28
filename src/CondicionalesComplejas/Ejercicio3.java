package CondicionalesComplejas;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 10) + 1;
        int n2 = (int) (Math.random() * 10) + 1;
        int n3 = (int) (Math.random() * 10) + 1;
        System.out.printf("Numero 1: %d%nNumero 2: %d%nNumero 3: %d%n", n1, n2, n3);

        if (n1 >= n2 && n1 >= n3) {
            System.out.printf("El numero %d es mayor", n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.printf("El numero %d es mayor", n2);
        } else {
            System.out.printf("El numero %d es mayor", n3);
        }
    }
}
