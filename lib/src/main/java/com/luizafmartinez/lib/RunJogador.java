package com.luizafmartinez.lib;

public class RunJogador {

    public static void main(String[] args) {

        Jogador alex = new Jogador();
        alex.kart = "Normal";
        alex.pneu = "Cross";
        alex.planador = "Paraquedas";

        Jogador computador = new Jogador();
        computador.pneu = "Avancado";

        alex.acelerar();
        computador.acelerar();
    }
}
