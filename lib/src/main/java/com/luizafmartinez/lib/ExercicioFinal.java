package com.luizafmartinez.lib;

abstract class Veiculo { // Super classe , abstrata

    // Atributos
    String nome;
    int qtdRodas;

    //Construtor
    public Veiculo() {

    }

    // Construtor para configurar os atributos
    public Veiculo(String nome, int qtdRodas) {
        this.nome = nome;
        this.qtdRodas = qtdRodas;
    }

    abstract void acelerar();  // Método abstrato acelerar
}

interface Eletrificado {   //Interface Eletrificado

    void motorEletrico(); // Método motorEletrico
}

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

        System.out.println("Intensidade da aceleracao " +
                intensidade);
    }
}


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
        System.out.println("Intensidade da aceleracao " +
                intensidade);
    }

    @Override   //Implementacao do metodo abstrato
    public void motorEletrico() {

        System.out.println("Rodando com motor eletrico");
    }
}


public class ExercicioFinal {

    public static void main(String[] args) {

        // instanciando
        Carro carro = new Carro("Hummer H1", 4);

        //carro.acelerar(); //usando método acelerar
        carro.acelerar(4);

        System.out.println("----------------------------------------------");

        // instanciando
        Moto moto = new Moto("Harley Davidson", 2);
        //moto.acelerar(); //usando método acelerar
        moto.acelerar(4);
    }
}

/*
    Exercício Herança

• Crie uma classe Veiculo e essa classe será uma super classe (abstrata) tendo os
        atributos:

        nome Indica o nome do carro, por exemplo “Gol”,
        “BMW 320i”, “Vectra” e etc.

        qtdRodas Indica a quantidade de rodas que um veículo pode ter

        Crie um construtor nessa classe para configurar os seus atributos,
        também será necessário um método abstrato acelerar.
-----------------------------------------------------------------------
        Crie as seguintes classes:

        Carro /  Moto

        Irão ser filhas de Veiculo e precisam implementar o
        método acelerar, que vai exibir a mensagem
        “Acelerar <nome> com <qtdRodas> rodas”

        também é necessário configurar um construtor
        para configurar os atributos criados na super classe
        (classe pai) para que possam ser usados nas classes
        concretas (Carro e Moto).

        Instancie ambas as classes (passando parâmetros para o
        construtor) e utilize o método acelerar.
------------------------------------------------------------------------------
        Exercício Interface

        • Aproveitando os códigos criados anteriormente, você vai agora criar uma
        Interface chamada Eletrificado contendo um método motorEletrico, que deve
        ser implementado pela classe Moto, indicando que a moto deve ter a
        implementação de um motor elétrico, nesse médoto exiba apenas uma
        mensagem:
        Rodando com motor elétrico

        • Esse método motorEletrico, deve ser chamado dentro do método acelerar da
        moto, para que ao acelerar seja usado agora o motor elétrico.
------------------------------------------------------------------------------
        Exercício Sobrecarga

        O método acelerar pode ser usado de duas maneiras:

        Sem parâmetro:
        Como ele já está atualmente, posso
        simplesmente chamar o método sem passar
        parâmetro.

        Com parâmetro:
        Precisamos utilizar sobrecarga de método para
        criar o método acelerar com um parâmetro
        inteiro que irá receber a intensidade da
        aceleração e exibir essa intensidade no método
        acelerar.
--------------------------------------------------------------------------------
        Saída:

Acelerar Hummer H1 com 4 rodas.
Intensidade da aceleracao 4
----------------------------------------------
Acelerar Harley Davidson com 2 rodas.
Rodando com motor eletrico
Intensidade da aceleracao 4


*/