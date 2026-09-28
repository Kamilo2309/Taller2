package CondicionalesComplejas;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 19001) + 1000;

        String resultado = (numero <= 9999) ? "tiene 4 cifras" : "supera las 4 cifras";

        System.out.printf("El numero %d %s", numero, resultado);
    }
}
