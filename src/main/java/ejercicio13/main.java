package ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

    public static void main(String[] args) {
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strFecha = fecha.format(now);

        System.out.println("Fecha y hora actual: "+strFecha);
    }

}
