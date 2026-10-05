package Matrices;

public class Ejercicio3 {
    public static void almacenar(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 51);
            }
        }
    }
    public static void imprimir(int[][] numeros) {
        for (int j = 0; j < numeros[0].length; j++) {
            System.out.print(numeros[0][j] + "\t");
        }
        System.out.println();

        for (int i = 1; i < numeros.length - 1; i++) {
            System.out.print("\t" + numeros[i][1] + "\t");
        }
        System.out.println();

        for (int j = 0; j < numeros[2].length; j++) {
            System.out.print(numeros[2][j] + "\t");
        }
    }
    public static void main(String[] args) {
        int[][] numeros = new int[3][4];

        Ejercicio3.almacenar(numeros);
        Ejercicio3.imprimir(numeros);
    }
}
