package ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        System.out.println("Introduzca el numero donde iniciara la secuencia: ");
        int num = cargarNum();

        for (int i = num; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }

    static int cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Integer.parseInt(num);
    }
}
