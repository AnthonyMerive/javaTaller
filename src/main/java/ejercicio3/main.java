package ejercicio3;

import java.io.*;

import static java.lang.Math.pow;

public class main {
    public static void main(String[] args) throws IOException {

        System.out.println("Introduzca el radio del circulo: ");
        double radio = cargarNum();

        double area = Math.PI * pow(radio, 2);

        System.out.println("El area del circulo para un radio de "+radio+" es: " + area);

    }

    static double cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Double.parseDouble(num);
    }
}
