package ejercicio5;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        int i = 1;
        LinkedList pares = new LinkedList();
        LinkedList impares = new LinkedList();

        while (i <= 100) {

            if (i % 2 == 0) {
                pares.add(i);
            }
            if (i % 2 == 1) {
                impares.add(i);
            }

            i++;
        }
        System.out.println("Pares: ");
        pares.stream().forEach((e) -> {
            System.out.println(e);
        });

        System.out.println("\n\nImpares: ");
        impares.stream().forEach((e) -> {
            System.out.println(e);
        });
    }
}
