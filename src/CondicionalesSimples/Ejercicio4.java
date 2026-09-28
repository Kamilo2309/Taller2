package CondicionalesSimples;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 100) + 1;
        int n2 = (int) (Math.random() * 100) + 1;

        if (n1 % n2 == 0) {
            System.out.printf("El numero %d es multiplo de %d", n1, n2);
        } else if (n1 % n2 != 0) {
            System.out.printf("El numero %d no es multiplo de %d", n1, n2);
        }
    }
}
