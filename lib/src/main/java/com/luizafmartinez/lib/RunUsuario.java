package com.luizafmartinez.lib;

public class RunUsuario {

    public static void main(String[] args) {

        // Usuario usuario = new Usuario();   // Construtor vazio

        //Usuario usuario = new Usuario("jamilton@gmail.com", "123456");
        //System.out.println("Email: " + usuario.email + " Senha: " + usuario.senha);

       /*
       Usuario usuario = new Usuario("(11)9-8888-9999");
       System.out.println("Telefone: " + usuario.telefone);
        */

       /*
       Usuario usuario = new Usuario();
       usuario.calcularIMC();
        */

        /*
        usuario.email = "jamilton@gmail.com";
        usuario.senha = "123456";
        usuario.verificarUsuarioLogado();
        */

        Usuario usuario = new Usuario();

        //usuario.logar("j@com","1111122");   //Autenticação por email e senha

        //usuario.logar("11-9-9999-0000");  //Autenticação por telefone

        usuario.logar("jaja@email.com",9898); //Autenticação por email e Token

        //usuario.logar("j@com", 635);


    }
}
