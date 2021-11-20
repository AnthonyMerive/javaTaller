package ejercicio17;

public class Televisor extends Electrodomestico {

    int resolucion;
    boolean sintonizadorTDT;

    //Constructores:

    public Televisor() {
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precioBase, int peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //metodos getters


    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //metodos:

    @Override
    public double obtenerPrecioFinal() {

        double valorAgregado = super.obtenerPrecioFinal();

        if (resolucion > 40) {
            double porcentaje = valorAgregado * 0.30;
            valorAgregado += porcentaje;
        }

        if (sintonizadorTDT) {
            valorAgregado += 50;
        }

        return valorAgregado;
    }
}
