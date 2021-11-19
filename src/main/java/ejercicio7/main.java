package ejercicio7;

import java.io.*;

public class main {
    
    public static void main(String[] args) throws IOException {

        System.out.println("introduzca un numero: ");
        int num = cargarNum();

        do{
            System.out.println("el numero es: "+num);
            System.out.println("\nintroduzca otro numero (0 para salir): ");
            num = cargarNum();
        }while(num!=0);

    }

    static int cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Integer.parseInt(num);
    }
}
