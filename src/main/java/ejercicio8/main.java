package ejercicio8;

import java.io.*;
import java.util.Locale;

public class main {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduzca un dia de la semana: ");
        String dia = cargarString().toLowerCase();

        String laboral = dia + " es laboral";
        String noLaboral = dia + " no es laboral";

        switch (dia) {
            case "lunes":
                System.out.println(laboral);
                break;
            case "martes":
                System.out.println(laboral);
                break;
            case "miercoles":
                System.out.println(laboral);
                break;
            case "jueves":
                System.out.println(laboral);
                break;
            case "viernes":
                System.out.println(laboral);
                break;
            case "sabado":
                System.out.println(noLaboral);
                break;
            case "domingo":
                System.out.println(noLaboral);
                break;
            default:
                System.out.println("Dato invalido");
                break;
        }

    }

    static String cargarString() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        return buffer.readLine();
    }
}
