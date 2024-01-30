package com.luizafmartinez.lib;

class Animal {    // Classe pai => SUPER classe

    String cor;
    int tamanho;
    double peso;

    void correr() {
        System.out.println("Correndo...");
    }

    void dormir() {
        System.out.println("Dormindo...");
    }

}

/*
abstract class Animal {  //Classe pai => Super classe, abstrata

    String cor;
    int tamanho;
    int quantidadePatas;
    double peso;

    public Animal() {

    }   */


    /*

    public Animal(String cor,int tamanho, int qtdPatas, double peso){
        //Validações do que foi passado
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadePatas = qtdPatas;
        this.peso = peso;
    }

    void correr() {

        System.out.println("Correr como um "); // 20 linhas fictícias
    }

    void dormir() {

        System.out.println("Dormir.");
    }
*/
