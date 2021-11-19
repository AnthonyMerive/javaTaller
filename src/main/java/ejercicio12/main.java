package ejercicio12;

import java.io.*;

public class main {

    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese una palabra: ");
        String palabraUno = cargarString().toLowerCase();
        System.out.println("Ingrese otra palabra: ");
        String palabraDos = cargarString().toLowerCase();

        if (palabraUno.contains(" ") || palabraDos.contains(" ")) {
            System.out.println("Introdujo una o mas frases, no una palabras");
        } else if (palabraUno.equals(palabraDos)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    static String cargarString() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        return buffer.readLine();
    }
}
