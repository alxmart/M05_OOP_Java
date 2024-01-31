package com.luizafmartinez.lib;

abstract class Animal {  // Classe pai => SUPER classe,  abstrata

    String cor;
    int tamanho;
    int quantidadePatas;
    double peso;

    public Animal() {

    }

    public Animal(String cor,int tamanho, int qtdPatas, double peso){
        // Validações do que foi passado
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadePatas = qtdPatas;
        this.peso = peso;
    }

    void correr() {
        System.out.println("Correr como um ");
    }

    void dormir() {
        System.out.println("Dormindo...");
    }

}

/*
abstract class Animal {  //Classe pai => Super classe, abstrata

    public Animal() {
    }

    public Animal(String cor,int tamanho, int qtdPatas, double peso){
        //Validações do que foi passado
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadePatas = qtdPatas;
        this.peso = peso;
    }
*/
