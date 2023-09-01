package ejemplosjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ProgramacionImperativa {

    public static void main(String[] args){

//        Arrays.asList(1,2,3,4,5,6,7,8,9).forEach(
//                n -> System.out.println(n + ""));
//
//
//        Arrays.asList("A", "B", "C", "D").forEach(System.out::println);

//        ArrayList<Integer> menorLista = new ArrayList<>();
//        for (Integer numero: Arrays.asList(1,2,3,4,5,6,7)){
//
//            if (numero > 5){
//                menorLista.add(numero);
//            }
//        }
//
//        for (Integer valor:menorLista){
//
//            System.out.println(valor);
//
//        }

        ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays
                .asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(x -> x > 5)
                .collect(Collectors.toCollection(() -> new ArrayList<Integer>()));

        mayores.forEach(e -> System.out.println(e));

    }


}
