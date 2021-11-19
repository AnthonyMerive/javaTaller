package ejercicio15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class main {

    public static void main(String[] args) throws IOException {
        String menu = (
                "****** GESTION CINEMATOGRAFICA ********\n" +
                        "1-NUEVO ACTOR\n" +
                        "2-BUSCAR ACTOR\n" +
                        "3-ELIMINAR ACTOR\n" +
                        "4-MODIFICAR ACTOR\n" +
                        "5-VER TODOS LOS ACTORES\n" +
                        "6- VER PELICULAS DE LOS ACTORES\n" +
                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "8-SALIR\n");

        System.out.println(new String(menu.getBytes("CP850"), StandardCharsets.ISO_8859_1));

        int op = -1;

        while (op != 8) {
            System.out.println("INTRODUZCA UNA OPCION: ");
            op = cargarNum();
            String mensaje = "ESCOGIO LA OPCION ";

            switch (op) {
                case 1:
                case 3:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println(mensaje + op);
                    break;
                case 8:
                    System.out.println("SALIDA");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }

        }
    }

    static int cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Integer.parseInt(num);
    }

}
