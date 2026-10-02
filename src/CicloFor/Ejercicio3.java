package CicloFor;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 5;
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (suma == numero) {
            System.out.printf("El numero %d es un numero perfecto", numero);
        } else {
            System.out.printf("El numero %d no es un numero perfecto", numero);
        }
    }
}
