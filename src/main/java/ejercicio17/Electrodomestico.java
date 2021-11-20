package ejercicio17;

import java.util.Locale;

public class Electrodomestico {

    //Atributos:

    double precioBase;
    String color;
    char consumoEnergetico;
    double peso;

    //Constructor por defecto:

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "BLANCO";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    //Constructor precio-peso

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "BLANCO";
        this.consumoEnergetico = 'F';
    }

    //Constructor con todos los atributos

    public Electrodomestico(double precioBase, int peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    //metodos

    //getters

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    //metodos restantes

    private char comprobarConsumoEnergetico(char consumoEnergetico) {

        if (Character.toString(consumoEnergetico).matches("[ABCDEF]")) {
            return consumoEnergetico;
        } else {
            return 'F';
        }

    }

    private String comprobarColor(String color) {

        if (color.equalsIgnoreCase("blanco negro rojo azul gris")) {
            return color.toUpperCase();
        } else {
            return "BLANCO";
        }

    }

    public double obtenerPrecioFinal() {

        double valorArgregado = 0;

        switch (consumoEnergetico) {
            case 'A':
                valorArgregado += 100;
                break;
            case 'B':
                valorArgregado += 80;
                break;
            case 'C':
                valorArgregado += 60;
                break;
            case 'D':
                valorArgregado += 30;
                break;
            case 'F':
                valorArgregado += 10;
                break;
            default:
                valorArgregado = 0;
                break;
        }

        if (peso >= 0 && peso < 20) {
            valorArgregado += 10;
        } else if (peso >= 20 && peso < 50) {
            valorArgregado += 50;
        } else if (peso >= 50 && peso < 80) {
            valorArgregado += 80;
        } else if (peso >= 80) {
            valorArgregado += 100;
        } else {
            valorArgregado += 0;
        }

        return precioBase + valorArgregado;

    }


}
