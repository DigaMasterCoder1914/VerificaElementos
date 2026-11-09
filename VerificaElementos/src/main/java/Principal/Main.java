package main.java.Principal;

import main.java.Entrada.RecebeInputs;
import main.java.Processamento.Contador;
import main.java.Processamento.PreencheContador;
import main.java.Saida.Impressora;

public class Main {
    public static void main(String[] args) {

        Contador contador = new Contador();

        PreencheContador preencheContador = new PreencheContador();

        Impressora impressora = new Impressora();

        RecebeInputs recebeInputs = new RecebeInputs();

        Algoritimo algoritimo = new Algoritimo(recebeInputs, contador, impressora, preencheContador);


        algoritimo.FluxoFinal();

    }
}