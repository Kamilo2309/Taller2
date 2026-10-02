package CicloWhile;

public class Ejercicio3 {
    public static void main(String[] args) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
        String parrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum.";
        String parrafoMinusculas = parrafo.toLowerCase();
        int contador = 0;
        int i = 0;
        char letra;

        while (i < parrafoMinusculas.length()) {
            int j = 0;
            letra = parrafoMinusculas.charAt(i);
            while (j < vocales.length) {
                if (letra == vocales[j]) {
                    contador++;
                }
                j++;
            }
            i++;
        }
        System.out.println("El número de vocales en el párrafo es: " + contador);
    }
}
