package com.luizafmartinez.lib;




abstract class Veiculo { // Super classe , abstrata

    String nome;  // Atributos
    int qtdRodas;

    public Veiculo() {   //Construtor
    }

    // Construtor para configurar os atributos

    public Veiculo(String nome, int qtdRodas) {
        this.nome = nome;
        this.qtdRodas = qtdRodas;
    }

    abstract void acelerar();  // Método abstrato acelerar
}
//============================================================
interface Eletrificado {   //Interface Eletrificado
    void motorEletrico(); // Método motorEletrico
}
//============================================================

class Carro extends Veiculo {  // Classe Carro filha de Veiculo

    public Carro() {    //Construtor
    }

    // Contrutor p/ configurar atributos criados na super classe
    public Carro(String nome, int qtdRodas) {
        super(nome, qtdRodas);
    }

    @Override    // Precisa implementa método abstrato acelerar
    void acelerar() {
        System.out.println("Acelerar " + nome + " com " +
                qtdRodas + " rodas.");
    }

    public void acelerar(int intensidade) {

        System.out.println("Acelerar " + nome + " com " +
                qtdRodas + " rodas.");

        System.out.println("Intensidade da aceleração " +
                intensidade);
    }
}

//============================================================

// Classe Moto filha de Veiculo

class Moto extends Veiculo implements Eletrificado {

    public Moto() {    //Construtor
    }

    // Contrutor p/ configurar atributos criados na super classe

    public Moto(String nome, int qtdRodas) {
        super(nome, qtdRodas);
    }

    @Override    // Precisa implementa método abstrato acelerar
    void acelerar() {
        System.out.println("Acelerar " + nome + " com " +
                qtdRodas + " rodas.");

        motorEletrico();  // Metodo motorEletrico
    }

    public void acelerar(int intensidade) {
        System.out.println("Acelerar " + nome + " com " +
                qtdRodas + " rodas.");
        motorEletrico();  // Metodo motorEletrico
        System.out.println("Intensidade da aceleração " +
                intensidade);
    }

    @Override   //Implementacao do metodo abstrato
    public void motorEletrico() {
        System.out.println("Rodando com motor elétrico");
    }
}
//============================================================

public class ExercicioFinal {
    public static void main(String[] args) {

        // instanciando
        Carro carro = new Carro("Hummer H1", 4);
        //carro.acelerar(); //usando método acelerar
        carro.acelerar(4);

        System.out.println("0");

        // instanciando
        Moto moto = new Moto("Harley Davidson", 2);
        //moto.acelerar(); //usando método acelerar
        moto.acelerar(4);
    }
}
