package CondicionalesSimples;

public class Ejercicio5 {
    public static void main(String[] args) {
        double numero = (double) (Math.random() * 10) + 1;

        String resultado = (numero <= 6) ? "perdio" : "aprobo";
        System.out.printf("El estudiante %s con %.0f puntos", resultado, numero);
    }
}
