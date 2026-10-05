package Matrices;

public class Ejercicio2 {
    public static int buscarMayor(int[][] numeros) {
        int mayor = numeros[0][0];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }
            }
        }
        return mayor;
    }
    public static void almacenar(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 51);
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] numeros = new int[5][3];

        Ejercicio2.almacenar(numeros);
        int mayor = Ejercicio2.buscarMayor(numeros);

        System.out.printf("%nEl numero mayor de la matriz es: %d", mayor);
    }
}
