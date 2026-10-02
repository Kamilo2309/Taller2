package CicloWhile;

public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra = "reconocer";
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                System.out.printf("La palabra %s no es un palíndromo.", palabra);
                return;
            }
            izquierda++;
            derecha--;

        }
        System.out.printf("La palabra %s es un palíndromo.", palabra);
    }
}
