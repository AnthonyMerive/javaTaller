package ejercicio18;

import ejercicio17.Electrodomestico;
import ejercicio17.Lavadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {
    public static void main(String[] args) throws IOException {

        Videojuego[] videojuegos = new Videojuego[2];
        Serie[] series = new Serie[2];

        String titulo;
        int horasEstimadas;
        int numeroDeTemporadas;
        String genero;
        String creador;
        String compania;

        System.out.println("REGISTRO DE SERIES\n");
        for (int i = 0; i < series.length; i++) {
            System.out.println("\nDatos de la Serie " + (i + 1) + "\n");

            System.out.println("Introduce el titulo: ");
            titulo = cargarString();
            System.out.println("Introduce las temporadas: ");
            numeroDeTemporadas = cargarNum();
            System.out.println("introduce el genero: ");
            genero = cargarString();
            System.out.println("Introduce el creador de la serie: ");
            creador = cargarString();

            series[i] = new Serie(titulo, numeroDeTemporadas, genero, creador);
        }

        System.out.println("REGISTRO DE VIDEOJUEGOS\n");
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println("\nDatos del videojuego " + (i + 1) + "\n");

            System.out.println("Introduce el titulo: ");
            titulo = cargarString();
            System.out.println("Introduce las horas estimadas: ");
            horasEstimadas = cargarNum();
            System.out.println("introduce el genero: ");
            genero = cargarString();
            System.out.println("Introduce la compañia desarrolladora ");
            compania = cargarString();

            videojuegos[i] = new Videojuego(titulo, horasEstimadas, genero, compania);
        }

        //proceso de entrega

        int contador = 0;

        //asigno estas series y juegos como entregados:

        series[1].entregado();
        videojuegos[0].entregado();

        System.out.println("\n\nSeries Registradas:");
        for (Serie serie : series) {
            if (serie.entregado) {
                contador++;
                serie.devolver();
            }

            System.out.println(serie);

            if (serie.compareTo(serie) > 1) {
                System.out.println("La serie" + serie.titulo + " tiene mas temporadas");
            }

        }
        System.out.println("\nVideojuegos Registrados:");
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.entregado) {
                contador++;
                videojuego.devolver();
            }

            System.out.println(videojuego);

            if (videojuego.compareTo(videojuego) > 1) {
                System.out.println("La serie" + videojuego.titulo + " tiene mas temporadas");
            }
        }

        System.out.println("\n\nseries y videojuegos Entregados: " + contador);

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
}
