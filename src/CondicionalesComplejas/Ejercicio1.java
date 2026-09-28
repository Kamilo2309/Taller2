package CondicionalesComplejas;

public class Ejercicio1 {
    public static void main(String[] args) {
        Integer edad = (int) (Math.random() * 101);

        String categoria = switch (edad) {
            case Integer n when n <= 5 -> "infante";
            case Integer n when n <= 10 -> "niño";
            case Integer n when n <= 15 -> "pre adolescente";
            case Integer n when n <= 18 -> "adolescente";
            case Integer n when n <= 25 -> "pre adulto";
            case Integer n when n <= 40 -> "adulto";
            case Integer n when n <= 55 -> "pre anciano";
            default -> "anciano";
        };

        System.out.printf("La edad de la persona es %d años y esta en la categoria %s", edad, categoria);
    }
}
