package ejercicio11;

import java.io.*;

public class main {

    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese una frase: ");
        String frase = cargarString().replace(" ", "").toLowerCase();
        char[] arrayFrase = frase.toCharArray();
        int contador = 0;

        for (char letra : arrayFrase) {
            if (Character.toString(letra).matches("[aeiou]"))
                contador++;
        }

        System.out.println("En la frase hay " + contador + " vocales y " + frase.length() + " letras en total");

    }

    static String cargarString() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        return buffer.readLine();
    }
}
