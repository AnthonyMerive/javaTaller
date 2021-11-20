package ejercicio16;

import java.util.Arrays;
import java.util.Random;

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
        this.DNI = generaDNI();

    }

    //Constructor con el nombre, edad y sexo, el resto por defecto.

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
    }

    //Constructor con los valores

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
    }

    //Metodos

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

    public char comprobarSexo(char sexo){
        if(sexo=='M'){
            return 'M';
        }else{
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Registro Agregado:{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    public String generaDNI(){
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int min = 10000000;
        int max = 99999999;
        int DNINumber = (int) (Math.random() * ( max - min )+min);
        int resto = DNINumber%23;

        return String.valueOf(DNINumber)+letras[resto];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
