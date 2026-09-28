package CondicionalesComplejas;

public class Ejercicio4 {
    public static void main(String[] args) {
        int cant_prg = 10;
        int cant_correctas = (int) (Math.random() * 11);

        Integer porcentaje = (int) (cant_correctas * 100 / cant_prg);

        String nivel = switch (porcentaje) {
            case Integer n when n < 50 -> "fuera de nivel";
            case Integer n when n < 75  -> "nivel regular";
            case Integer n when n < 90 -> "nivel medio";
            default -> "nivel maximo";
        };
        System.out.println("El porcentaje de respuestas correctas del postulante fue de " + porcentaje + "% y esta " + nivel);
    }
}
