package ejercicio2;

import java.io.*;

public class main {

    public static void main(String[] args) throws IOException {
        System.out.println("Introduzca un numero: ");
        int numA = cargarNum();
        System.out.println("Introduzca otro numero: ");
        int numB = cargarNum();

        if (numA > numB) {
            System.out.println("\n" + numA + " es mayor");
        } else if (numA < numB) {
            System.out.println("\n" + numB + " es mayor");
        } else {
            System.out.println("\n" + numA + " y " + numB + " son iguales");
        }
    }

    static int cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Integer.parseInt(num);
    }

}
