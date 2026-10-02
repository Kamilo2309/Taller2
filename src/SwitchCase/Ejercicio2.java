package SwitchCase;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el operador (+, -, *, /, %): ");
        String operador = sc.nextLine();
        int num1 = 10;
        int num2 = 5;

        String resultado = switch (operador) {
            case "+" -> "La suma es: " + (num1 + num2);
            case "-" -> "La resta es: " + (num1 - num2);
            case "*" -> "La multiplicacion es: " + (num1 * num2);
            case "/" -> num2 != 0 ? "La division es: " + (num1 / num2) : "No se puede dividir entre cero";
            case "%" -> num2 != 0 ? "El modulo es: " + (num1 % num2) : "No se puede dividir entre cero";
            default  -> "Operacion no valida";
        };
        System.out.println(resultado);
    }
}
