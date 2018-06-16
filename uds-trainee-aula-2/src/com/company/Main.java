package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> dadosPessoais = new ArrayList();

        dadosPessoais.add("Valteir");
        dadosPessoais.add("999-999");
        dadosPessoais.add("Rua das Palmeiras");
        dadosPessoais.add("325");
        dadosPessoais.add("Casa");
        dadosPessoais.add("Vila Matinhos");
        dadosPessoais.add("Maringá");
        dadosPessoais.add("Paraná");
        dadosPessoais.add("(44)99812-5460");

        dadosPessoais.set(0, "Valteir Eleuterio Alves");
        dadosPessoais.remove(8);

        dadosPessoais.stream().forEach((item)->{
            System.out.println(item);
        });
    }
}


