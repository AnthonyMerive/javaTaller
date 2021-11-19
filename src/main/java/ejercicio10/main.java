package ejercicio10;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese una frase: ");
        String frase = cargarString();
        System.out.println(frase.replace(" ",""));

    }

    static String cargarString() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        return buffer.readLine();
    }
}
