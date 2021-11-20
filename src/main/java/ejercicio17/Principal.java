package ejercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static void main(String[] args) throws IOException {

        Electrodomestico[] electrodomesticos = new Electrodomestico[3];
        int op;

        //Registro de productos:

        for (int i = 0; i < electrodomesticos.length; ) {

            System.out.println("\n1- Agregar Electrodomestico");
            System.out.println("2- Agregar Lavadora");
            System.out.println("3- Agregar Televisor");
            System.out.println("Digite una opcion: ");
            op = cargarNum();

            if (op == 1 || op == 2 || op == 3) {

                double precioBase = 0;
                int peso = 0;
                String color = "";
                char consumoEnergetico;
                int resolucion = 0;
                boolean sintonizadorTDT = false;
                int carga = 0;

                switch (op) {
                    case 1:
                        System.out.println("\nEligio agregar Electrodomestico\n");
                        System.out.println("Introduzca el precio: ");
                        precioBase = cargarDouble();
                        System.out.println("Introduzca el peso: ");
                        peso = cargarNum();
                        System.out.println("Introduzca color (blanco, negro, rojo, azul, gris): ");
                        color = cargarString();
                        System.out.println("Introduzca el consumo (A,B,C,D,E,F): ");
                        consumoEnergetico = cargarChar();

                        electrodomesticos[i] = new Electrodomestico(precioBase, peso, color, consumoEnergetico);

                        System.out.println("\nElectrodomestico agregado!");
                        i++;

                        break;
                    case 2:
                        System.out.println("\nEligio agregar Lavadora\n");
                        System.out.println("Introduzca el precio: ");
                        precioBase = cargarDouble();
                        System.out.println("Introduzca el peso: ");
                        peso = cargarNum();
                        System.out.println("Introduzca color (blanco, negro, rojo, azul, gris): ");
                        color = cargarString();
                        System.out.println("Introduzca el consumo (A,B,C,D,E,F): ");
                        consumoEnergetico = cargarChar();
                        System.out.println("Introduzca la carga: ");
                        carga = cargarNum();

                        electrodomesticos[i] = new Lavadora(precioBase, peso, color, consumoEnergetico, carga);

                        System.out.println("\nLavadora agregado!");
                        i++;

                        break;
                    case 3:
                        System.out.println("\nEligio agregar Televisor\n");
                        System.out.println("Introduzca el precio: ");
                        precioBase = cargarDouble();
                        System.out.println("Introduzca el peso: ");
                        peso = cargarNum();
                        System.out.println("Introduzca color (blanco, negro, rojo, azul, gris): ");
                        color = cargarString();
                        System.out.println("Introduzca el consumo (A,B,C,D,E,F): ");
                        consumoEnergetico = cargarChar();
                        System.out.println("Introduzca las pulgadas: ");
                        resolucion = cargarNum();
                        System.out.println("¿Posee Codificador TDT? (true - si , false - no): ");
                        sintonizadorTDT = cargarBoolean();

                        electrodomesticos[i] = new Televisor(precioBase, peso, color, consumoEnergetico, resolucion, sintonizadorTDT);

                        System.out.println("\nTelevisor agregado!");
                        i++;

                        break;
                    default:
                        System.out.println("¡Opcion erronea!");
                        break;
                }
            }
        }

        //Sumatoria de productos

        double totalOtros = 0;
        double totalLavadora = 0;
        double totalTelevisor = 0;

        for(int i =0; i<electrodomesticos.length; i++) {
            if (electrodomesticos[i] instanceof Electrodomestico)
                totalOtros += electrodomesticos[i].obtenerPrecioFinal();
            if (electrodomesticos[i] instanceof Televisor)
                totalTelevisor += electrodomesticos[i].obtenerPrecioFinal();
            if (electrodomesticos[i] instanceof Lavadora)
                totalLavadora += electrodomesticos[i].obtenerPrecioFinal();

            System.out.println(electrodomesticos[i].toString());
        }

        //Mostramos totales:

        System.out.println("\nTotales: \n");
        System.out.println("Lavadoras: "+totalLavadora);
        System.out.println("Televisores: "+totalTelevisor);
        System.out.println("Electrodomesticos: "+totalOtros);
    }

    static String cargarString() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        return buffer.readLine();
    }

    static int cargarNum() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Integer.parseInt(num);
    }

    static char cargarChar() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        return (buffer.readLine().toUpperCase()).charAt(0);
    }

    static double cargarDouble() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Double.parseDouble(num);
    }

    static boolean cargarBoolean() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        String num = buffer.readLine();
        return Boolean.parseBoolean(num);
    }

}
