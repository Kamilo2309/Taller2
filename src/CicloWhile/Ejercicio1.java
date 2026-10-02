package CicloWhile;

public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra = "Programación";
        String palabraInvertida = "";
        int longitud = palabra.length() - 1;

        while (longitud >= 0) {
            palabraInvertida += palabra.charAt(longitud);
            longitud--;
        }
        System.out.printf("La palabra invertida de %s es: %s", palabra, palabraInvertida);
    }
}
