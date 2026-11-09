package main.java.Processamento;

import java.util.List;
import java.util.Map;



public class PreencheContador {


    public  void Preenchimento (Map<Integer,Integer> ContaFrequencia, List<Integer> list ) {


        for (Integer numero : list){

        ContaFrequencia.put(numero,ContaFrequencia.getOrDefault(numero,0) + 1);



}


    }

}
