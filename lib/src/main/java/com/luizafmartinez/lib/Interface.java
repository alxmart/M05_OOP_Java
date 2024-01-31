package com.luizafmartinez.lib;

abstract class Pessoa {

    String nome;
    int idade;

    abstract void comer();

   /* void candidatarSeCargoPolitico() {
        System.out.println("Candidatar-se a cargo político.");
    }*/
}

// Na interface este método é abstrato!
// interface , abstrata , não pode ter body
interface Presidente {    //Presidenciavel

    void candidatarSeCargoPolitico();
    //abstract void candidatarSeCargoPolitico();
}

class DesenvolvedorAndroid extends Pessoa  {

    void programar() {

    }

    @Override
    void comer() {

    }
}

class DesenvolvedorWeb extends Pessoa {

    @Override
    void comer() {

    }
}

class ServidorPublico extends Pessoa {

    @Override
    void comer() {

    }
}

class Jornalista extends Pessoa implements Presidente {

    void escreverNoticia() {

    }

    @Override
    public void candidatarSeCargoPolitico() {

    }

    @Override
    void comer() {

    }
}

class Endereco {

    String rua;


}

class Usuario2 {

    void finalizarCompra(Endereco endereco) {  //Java -passa parâmetro por valor.

        System.out.println("Antes: " + endereco.rua);
        endereco.rua = "Rua 02";
    }
}


public class Interface {

    public static void main(String[] args) {

        DesenvolvedorAndroid devAndroid = new DesenvolvedorAndroid();
        //devAndroid.candidatarSeCargoPolitico();

        Jornalista jornalista = new Jornalista();
        jornalista.candidatarSeCargoPolitico();

        //String endereco = "Rua 01";
        Endereco endereco = new Endereco();
        endereco.rua = "Rua 01";

        Usuario2 usuario = new Usuario2();
        usuario.finalizarCompra( endereco );
        endereco.rua = "Rua 03";
        System.out.println("Depois: " + endereco.rua );
    }
}