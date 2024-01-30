package com.luizafmartinez.lib;

class Cachorro extends Animal {  // Classe filha ou subclasse

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

    void latir( String pessoa) {
        System.out.println("Latindo para " + pessoa );
    }

    // Sobrescrita / Sobreposição de método
    @Override
    void correr() {
        super.correr();    // Implementação padrão
        System.out.println("cachorro com patas: " + this.quantidadePatas);
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
