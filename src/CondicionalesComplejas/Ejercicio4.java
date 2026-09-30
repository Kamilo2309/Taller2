package CondicionalesComplejas;

public class Ejercicio4 {
    public static void main(String[] args) {
        int cant_prg = 10;
        int cant_correctas = (int) (Math.random() * 11);
        String nivel = "";
        Integer porcentaje = (int) (cant_correctas * 100 / cant_prg);

        if (porcentaje < 50) {
            nivel = "fuera de nivel";
        } else if (porcentaje < 75) {
            nivel = "nivel regular";
        }else if (porcentaje < 90) {
            nivel = "nivel medio";
        } else if (porcentaje <= 100) {
            nivel = "nivel maximo";
        }

        System.out.println("El porcentaje de respuestas correctas del postulante fue de " + porcentaje + "% y esta " + nivel);
    }
}
