package ejercicio6;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList pares = new LinkedList();
        LinkedList impares = new LinkedList();

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                pares.add(i);
            }
            if (i % 2 == 1) {
                impares.add(i);
            }
        }

        System.out.println("Pares:");
        pares.stream().forEach((e) -> {
            System.out.println(e);
        });

        System.out.println("\n\nImpares: ");
        impares.stream().forEach((e) -> {
            System.out.println(e);
        });
    }
}
