package main.java.Saida;

import java.util.List;
import java.util.Map;

public class Impressora {

    public void ImprimeTodosOsNumeros(

            List<Integer> ListaNumeros

    ){

        System.out.println("Lista de Numeros:");

        for(Integer numero : ListaNumeros){

            System.out.print(numero + ",");


        }


    }


    public void ImprimeMaioresIndices (Map<Integer,Integer> ContaFrequencia, List<Integer> indicesMaiores, int MaiorAlvo) {


        System.out.println("Os maiores indices são");

        for (Integer indiceMaior : indicesMaiores) {

            System.out.println(" Numero " + indiceMaior + " com " + MaiorAlvo + " Aparições ");
            System.out.println();

        }



    }




}
