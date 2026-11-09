package main.java.Principal;



import main.java.Entrada.RecebeInputs;
import main.java.Processamento.Contador;
import main.java.Processamento.PreencheContador;
import main.java.Saida.Impressora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algoritimo {


   Contador contador;

   PreencheContador preencheContador;

  Impressora impressora;



    RecebeInputs Entrada;

    public Algoritimo(RecebeInputs Entrada, Contador contador,Impressora impressora, PreencheContador preencheContador) {

        this.contador = contador;
        this.impressora = impressora;
        this.preencheContador = preencheContador;
        this.Entrada = Entrada;
    }


    private List<Integer> Entrada(){

      return Entrada.GeraLista();


   }

    private int Processamento(Map<Integer,Integer> ContaFrequencia, List<Integer> list,List<Integer> indicesMaiores){


       preencheContador.Preenchimento( ContaFrequencia,  list);
        return  contador.DescobreMaioresFrequencias( ContaFrequencia,  indicesMaiores, list );


   }


   private void Saida(Map<Integer,Integer> ContaFrequencia, List<Integer> indicesMaiores, int MaiorAlvo,List<Integer> list){


        impressora.ImprimeTodosOsNumeros(list);
        impressora.ImprimeMaioresIndices(ContaFrequencia,indicesMaiores,MaiorAlvo);




   }


   public void FluxoFinal(){

       int MaiorAlvo = 0;

      Map<Integer,Integer> ContaFrequencia = new HashMap<>();

      List<Integer> indicesMaiores = new ArrayList<>();

     List<Integer> Lista = Entrada();
     MaiorAlvo =  Processamento( ContaFrequencia, Lista ,indicesMaiores);

       Saida(ContaFrequencia ,indicesMaiores, MaiorAlvo,Lista);

   }


}
