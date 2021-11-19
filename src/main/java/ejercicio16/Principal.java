package ejercicio16;

public class Principal {

    public static void main(String[] args) {
        Persona a = new Persona("Anthony",13,"DNI",'H',70,183);

        System.out.println(a.nombre);

        if(a.calcularIMC()==1){
            System.out.println("Sobre-Peso");
        }else if(a.calcularIMC()<0){
            System.out.println("Desnutricion");
        }else{
            System.out.println("Peso Ideal");
        }

        if(a.esMayorDeEdad()) System.out.println("Es mayor de edad");
        else System.out.println("Es menor de edad");

    }

}
