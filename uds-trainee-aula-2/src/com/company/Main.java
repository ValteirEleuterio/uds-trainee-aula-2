package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//        Pessoa pessoa = new Pessoa("Valteir","999-999","Rua kiri","333","casa","bandeiras","Maringá","PR","(44)9955-6253");
//        System.out.println(pessoa.obterInformacoes());

        Macaco macaco = new Macaco("Macaco Prego");

        macaco.andar();
        macaco.andar();
        macaco.andar();

        macaco.comerBananas();
        macaco.comerBananas();
        macaco.comerBananas();

        System.out.println("Metros percorridos pelo macaco: " + macaco.metrosPercorridos+" metros");
        System.out.println("Bananas comidas: " + macaco.bananasComidas+" bananas");
    }
}


