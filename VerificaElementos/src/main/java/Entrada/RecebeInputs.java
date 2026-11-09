package main.java.Entrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RecebeInputs {


    public List<Integer> GeraLista() {

List<Integer> ListaUsuario = new ArrayList<>();
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);

        int NumUsuario = 0;
        int Limite = 0;

        System.out.print("Digite um número para ser a semente");

        NumUsuario = input.nextInt();

        System.out.print("Digite Quantos elementos quer na lista");

        Limite = input.nextInt();

        for(int i =0;i <= Limite;i++) {

            ListaUsuario.add(gerador.nextInt(NumUsuario));
        }


        input.close();
        return ListaUsuario;

    }



}
