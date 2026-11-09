package main.java.Processamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Contador {

    public int DescobreMaioresFrequencias(Map<Integer, Integer> ContaFrequencia, List<Integer> indicesMaiores, List<Integer> list) {


        List<Integer> Copia = new ArrayList<>(ContaFrequencia.values());

        Copia.sort(null);

        int MaiorAlvo = Copia.getLast();


        for (Integer numero : list) {


            if (ContaFrequencia.get(numero) == MaiorAlvo && !indicesMaiores.contains(numero)) {


                indicesMaiores.add(numero);


            }


        }

        return MaiorAlvo;

    }


}








