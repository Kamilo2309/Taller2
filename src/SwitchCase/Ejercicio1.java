package SwitchCase;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de motor (0, 1, 2 o 3): ");
        int tipoMotor = scanner.nextInt();

        String resultado = switch (tipoMotor) {
            case 0 -> "No hay establecido un valor definido para el tipo.";
            case 1 -> "agua.";
            case 2 -> "gasolina.";
            case 3 -> "hormigón.";
            default -> "No existe un valor valido.";
        };
        System.out.println(resultado);
    }
}
