package com.company;

public abstract class Animal {
    private String nome = null;
    protected Integer metrosPercorridos = 0;

    public Animal(String nome){
        this.nome = nome;
    }
    public Integer obterMetrosPercorridos() {
        return this.metrosPercorridos;
    }
    public abstract void andar();
}
