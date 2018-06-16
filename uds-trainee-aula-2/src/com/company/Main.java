package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> dadosPessoais = new ArrayList();
        ArrayList<String> cadastrosDados = new ArrayList();
        cadastrosDados.add("Nome: ");
        cadastrosDados.add("Cep: ");
        cadastrosDados.add("Rua: ");
        cadastrosDados.add("Numero: ");
        cadastrosDados.add("Complemento: ");
        cadastrosDados.add("Bairro: ");
        cadastrosDados.add("Cidade: ");
        cadastrosDados.add("Estado: ");
        cadastrosDados.add("Telefone: ");


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

        for (int i = 0; i < dadosPessoais.size(); i++) {
            System.out.println(cadastrosDados.get(i) + dadosPessoais.get(i));
        }
    }
}


