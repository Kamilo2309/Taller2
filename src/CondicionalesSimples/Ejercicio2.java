package CondicionalesSimples;

public class Ejercicio2 {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 10) + 1;
        int n2 = (int) (Math.random() * 10) + 1;
        int potencia = 0;

        if (n1 > n2) {
            System.out.printf("El numero %d es mayor a %d", n1, n2);
            potencia = (int) Math.pow(n1, n2);
        } else if (n1 == n2) {
            System.out.printf("El numero %d es igual a %d", n1, n2);
        } else {
            System.out.printf("El numero %d es mayor a %d", n2, n1);
            potencia = (int) Math.pow(n2, n1);
        }

        System.out.printf("%nEl resultado de la potencia es: %d", potencia);
    }
}
