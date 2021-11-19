package ejercicio16;

public class Persona {

    //Atributos:

    String nombre;
    int edad;
    char sexo;
    int peso;
    double altura;
    String DNI;

    //Constructor por defecto:

    public Persona() {

        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        this.DNI = "";

    }

    //Constructor con el nombre, edad y sexo, el resto por defecto.

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.DNI = "";
    }


    //Constructor con los valores

    public Persona(String nombre, int edad, String DNI, char sexo, int peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
    }

    public int calcularIMC() {

        double IMC = peso / Math.pow(altura / 100, 2);

        if (IMC < 20) {
            return -1;
        } else if (IMC > 20 && IMC < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if(edad>=18) {
            return true;
        }else{
            return false;
        }
    }
}
