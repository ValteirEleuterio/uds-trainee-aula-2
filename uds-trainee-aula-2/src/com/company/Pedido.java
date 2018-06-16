package com.company;

import java.util.ArrayList;

public class Pedido {
    private Double total = 0.0;
    private ArrayList<Produto> produtos = new ArrayList<>();


    public Pedido(){

    }

    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
        calcularTotal(produto.valor);
    }


    public void calcularTotal(Double p){
        total += p;
    }


    public String exibePedido(){
        return "Pedido : "+ produtos;
    }

}
