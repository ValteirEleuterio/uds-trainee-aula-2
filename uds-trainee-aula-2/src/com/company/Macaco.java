package com.company;

public class Macaco extends Animal{
    Integer bananasComidas = 0;

    public Macaco(String nome) {
        super(nome);
    }
    public Integer getBananasComidas(){
        return bananasComidas;
    }
    public void comerBananas(){
        bananasComidas++;
    }

    @Override
    public void andar() {
        metrosPercorridos += 5;
    }
}
