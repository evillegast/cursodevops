package ejemplosjava;

import java.util.Random;

public class Ramdoniando {

    public static void main(String[] args) {


        Random generadorAleatorio = new Random();

        // Numero Aleatorio de 0-99
        int numGenerado = generadorAleatorio.nextInt(100);
        System.out.println("Generado: " + numGenerado);


    }







}
