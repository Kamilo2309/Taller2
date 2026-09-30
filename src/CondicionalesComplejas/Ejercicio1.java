package CondicionalesComplejas;

public class Ejercicio1 {
    public static void main(String[] args) {
        Integer edad = (int) (Math.random() * 101);
        String categoria = "";

        if (edad <= 5) {
            categoria = "infante";
        } else if (edad <= 10) {
            categoria = "niño";
        }else if (edad <= 15) {
            categoria = "pre adolescente";
        } else if (edad <= 18) {
            categoria = "adolescente";
        } else if (edad <= 25) {
            categoria = "pre adulto";
        } else if (edad <= 45) {
            categoria = "adulto";
        } else if (edad <= 55) {
            categoria = "pre anciano";
        } else {
            categoria = "anciano";
        }

        System.out.printf("La edad de la persona es %d años y esta en la categoria %s", edad, categoria);
    }
}
