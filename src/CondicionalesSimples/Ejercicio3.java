package CondicionalesSimples;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 101) - 50;

        String resultado = (numero < 0) ? "es un numero negativo" : "es un numero Positivo";

        System.out.printf("El numero %d %s", numero, resultado);

    }
}
