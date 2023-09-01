package ejemplosjava;


import java.util.HashMap;
import java.util.Map;

public class EjemplosDiccionarios {


    public static void main(String[] args) {

        Map<Integer, String> diccionarioHash = new HashMap<>();
        diccionarioHash.put(1, "Cristian");
        diccionarioHash.put(2, "Cristian2");
        diccionarioHash.put(3, "Cristian3");
        diccionarioHash.put(4, "Cristian4");
        diccionarioHash.put(5, "Cristian5");

        for (Map.Entry<Integer, String> entry : diccionarioHash.entrySet()){

            System.out.println("Clave :"+ entry.getKey()+"---"+"Valor :"+ entry);
        }

}




}
