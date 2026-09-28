package CondicionalesSimples;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100) + 1;

        if (numero < 50) {
            System.out.printf("El numero %d es menor a 50", numero);
        } else if (numero == 50) {
            System.out.printf("El numero %d es igual a 50", numero);
        } else {
            System.out.printf("El numero %d es mayor a 50", numero);
        }
    }
}
