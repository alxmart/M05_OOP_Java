package com.luizafmartinez.lib;

public class Usuario {

    // Atributos:

    String email;
    String senha;
    String telefone;

    // Construtor           OBS: Não pode ser void, pois vira método e não é chamado.
    // Assinatura de método: nome  +   parâmetro e tipo.

    // Construtor (Vazio)

    Usuario() {

    }

    // Construtor

    Usuario(String email, String senha) {
        // System.out.println("Construtor executado.");
        System.out.println("Autenticação por email e senha.");
        this.email = email;  // this => aponta pra dentro da classe
        this.senha = senha;
    }
    // Construtor (Sobrecarga de construtor)

    Usuario(String telefone) {
        this.telefone = telefone;
        System.out.println("Autenticacao por telefone.");
    }


    // Método
    void verificarUsuarioLogado() {
        System.out.println("verificando usuario logado...");
    }

    void calcularIMC() {

    }


    //Metodo:

    // Neste caso não usaria o construtor para passar as informações.

    // Sobrecarga de Método:

    void logar(String email, String senha) {
        System.out.println("Autenticacao por email e senha");
    }

    void logar(String telefone) {
        System.out.println("Autenticacao por telefone");
    }

    void logar(String email, int token) {
        System.out.println("Autenticacao por Token");
    }




}