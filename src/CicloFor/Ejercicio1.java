package CicloFor;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial del numero %d! es: %d", numero, factorial);
    }
}
