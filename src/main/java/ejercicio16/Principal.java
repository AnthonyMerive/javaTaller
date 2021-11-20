package ejercicio16;

import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {

        //Solicito datos:

        //Primera persona:
        System.out.println("\nPrimer Registro:\n");

        System.out.println("Introduzca Nombre completo: ");
        String nombre = cargarString();
        System.out.println("Introduzca edad: ");
        int edad = cargarNum();
        System.out.println("Introduzca sexo (H para hombre, M para mujer): ");
        char sexo = cargarChar();
        System.out.println("Introduzca peso (en kg): ");
        int peso = cargarNum();
        System.out.println("Introduzca altura (en cm): ");
        int altura = cargarNum();

        Persona personaA = new Persona(nombre, edad, sexo, peso, altura);

        //Segunda persona:
        System.out.println("\nSegundo Registro:\n");

        System.out.println("Introduzca Nombre completo: ");
        nombre = cargarString();
        System.out.println("Introduzca edad: ");
        edad = cargarNum();
        System.out.println("Introduzca sexo (H para hombre, M para mujer): ");
        sexo = cargarChar();

        Persona personaB = new Persona(nombre, edad, sexo);

        //Tercera persona:

        Persona personaC = new Persona();
        personaC.setNombre("Pedro Perez");
        personaC.setEdad(16);
        personaC.setSexo('H');
        personaC.setPeso(60);
        personaC.setAltura(165);

        //muestro los objetos creados con sus mensajes:

        //primera persona:

        System.out.println("\n" + personaA);

        //mensaje
        mensajeValoracion(personaA.peso, personaA.calcularIMC(), personaA.esMayorDeEdad(), personaA.nombre);

        //segunda persona:

        System.out.println("\n" + personaB);

        //mensaje
        mensajeValoracion(personaB.peso, personaB.calcularIMC(), personaB.esMayorDeEdad(), personaB.nombre);

        //tercera persona:

        System.out.println("\n" + personaC);

        //mensaje
        mensajeValoracion(personaC.peso, personaC.calcularIMC(), personaC.esMayorDeEdad(), personaC.nombre);
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

    static void mensajeValoracion(int peso, int IMC, boolean mayorDeEdad, String nombre) {
        if (peso != 0) {
            if (IMC == 1) System.out.println(nombre + " esta en sobre-Peso");
            else if (IMC < 0) System.out.println(nombre + " esta en esnutricion");
            else System.out.println(nombre + " tiene un peso Ideal");
        } else {
            System.out.println(nombre + " no tiene peso o altura registrado");
        }

        if (mayorDeEdad) System.out.println(nombre + " es mayor de edad");
        else System.out.println(nombre + " es menor de edad");
    }

}
