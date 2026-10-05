package Matrices;

public class Ejercicio1 {
    public static void almacenar(int[][] numeros, int aleatorio, String par) {
        int contador = 1;
        int temp;

        System.out.println("\nMatriz de numeros " + par + "es del 0 al " + (aleatorio - 1) + " \n");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                do {
                    temp = (int) (Math.random() * aleatorio);
                } while (par == "par" ? temp % 2 != 0 : temp % 2 == 0 );
                numeros[i][j] = temp;
                System.out.print("[" + (contador) + "] => " + numeros[i][j] + "\t");
                contador++;
            }
            System.out.println();
        }
    }
    public static void sumar(int[][] numerosUno, int[][] numerosDos, int[][]contenedor) {
        System.out.println("\nSuma de la matriz numeroUno y la matriz numerosDos\n");
        int contador = 1;
        for (int i = 0; i < contenedor.length; i++) {
            for (int j = 0; j < contenedor[i].length; j++) {
                contenedor[i][j] = numerosUno[i][j] + numerosDos[i][j];
                System.out.print("[" + (contador) + "] => " + contenedor[i][j] + "\t");
                contador++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int M = 4;

        int[][] numerosUno = new int[N][M];
        int[][] numerosDos = new int[N][M];
        int[][] contenedor = new int[N][M];

        Ejercicio1.almacenar(numerosUno, 101, "par");
        Ejercicio1.almacenar(numerosDos, 51, "impar");
        Ejercicio1.sumar(numerosUno, numerosDos, contenedor);
    }
}
