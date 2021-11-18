package ejercicio4;

import java.io.*;

public class main {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduzca el precio del producto: ");
        double precio = cargarNum();

        double iva = 0.21;

        double total = (precio*iva)+precio;

        System.out.println("el precio total del arciculo con el IVA de 21% es: "+ total+"$");

    }

    static double cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Double.parseDouble(num);
    }

}
