package com.luizafmartinez.lib;



abstract class Pessoa {

    String nome;
    int idade;

    void comer() {
        System.out.println("Comer");
    }
}
interface Presidente { //Presidenciavel
    void candidatarSeCargoPolitico();//Na interface este método é abstrato!
}

class DesenvolvedorAndroid extends Pessoa {
    void programar(){}
}

class DesenvolvedorWeb extends Pessoa {}
class ServidorPublico extends Pessoa {}

class Jornalista extends Pessoa implements Presidente {
    void escreverNoticia() {
    }
    @Override
    public void candidatarSeCargoPolitico() {
        System.out.println("Candidatar-se a cargo político.");
    }
}

class Endereco {
    String rua;
}

class Usuariox {
    void finalizarCompra(Endereco endereco){
        System.out.println("Antes: " + endereco.rua);
        endereco.rua = "Rua 02";
    }

}

public class Interface {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.rua = "Rua 01";

        Usuariox userx = new Usuariox();
        userx.finalizarCompra(endereco); //passagem de parâmetro por valor
        endereco.rua = "Rua 03";
        System.out.println("Depois: " + endereco.rua);


//        DesenvolvedorAndroid devAndroid = new DesenvolvedorAndroid();
//        //devAndroid.candidatarSeCargoPolitico();
//
//        Jornalista jornalista = new Jornalista();
//        jornalista.candidatarSeCargoPolitico();

    }
}