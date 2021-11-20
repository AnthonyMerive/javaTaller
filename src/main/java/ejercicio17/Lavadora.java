package ejercicio17;

public class Lavadora extends Electrodomestico {

    int carga;

    //Constructores:

    public Lavadora() {
        this.carga = 5;
    }


    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, int peso, String color, char consumoEnergetico, int carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    //metodo get

    public int getCarga() {
        return carga;
    }

    //metodos

    @Override
    public double obtenerPrecioFinal() {

        double valorAgregado = super.obtenerPrecioFinal();

        if (carga > 30) {
            valorAgregado += 50;
        } else {
            valorAgregado += 0;
        }

        return valorAgregado;
    }
}
