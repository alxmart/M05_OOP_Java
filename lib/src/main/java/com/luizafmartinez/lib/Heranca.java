package com.luizafmartinez.lib;


public class Heranca {

    public static void main(String[] args) {

        //Cachorro cachorro = new Cachorro();

        Cachorro cachorro = new Cachorro(
                "Marrom", 8,4,1.5
        );

        cachorro.correr();

//        cachorro.latir();
//        cachorro.latir("Alex");
//        cachorro.quantidadePatas = 4;
//        cachorro.correr();


//        cachorro.latir();
//        cachorro.latir( "Jamilton");


       /*
       cachorro.quantidadePatas = 4;
        cachorro.correr();

        System.out.println("-----------------------------------------");

        Passaro passaro = new Passaro();
        passaro.quantidadePatas = 2;
        passaro.correr();
        */
    }
}
