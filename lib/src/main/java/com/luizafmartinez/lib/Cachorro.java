package com.luizafmartinez.lib;

class Cachorro extends Animal {  // Classe filha ou subclasse

    void latir() {
        System.out.println("Latindo...");
    }

}

/*
class Cachorro {

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
*/

//=================================================================

/*

// Classe filha ou subclasse

public class Cachorro extends Animal {//Classe filha,subclasse, concreta

    // Atributos específicos para o cachorro

    //Construtor
    public Cachorro() {
    }

    public Cachorro(String cor,int tamanho, int qtdPatas, double peso){
        super(cor, tamanho, qtdPatas, peso);
    }

    void latir() {
        System.out.println("Latir");
    }

    void latir(String pessoa) {
        System.out.println("Latir para " + pessoa);
    }

    // Sobrescrita de método => Sobreposição
    @Override
    void correr() {
        super.correr(); //Implementação padrão
        System.out.println("cachorro com patas: " + this.quantidadePatas);
    }
*/
