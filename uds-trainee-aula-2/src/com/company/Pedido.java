package com.company;

import java.util.ArrayList;

public class Pedido {
    private Double total = 0.0;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProdutos(){

    }

    public void calcularTotal(Integer valor){
        total += valor;
    }

}
