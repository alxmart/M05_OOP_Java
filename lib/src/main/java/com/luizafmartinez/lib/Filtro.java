package com.luizafmartinez.lib;

public class Filtro {

    // Sobrecarga de Método:

    void pretoEBranco(String imagem) {
        System.out.println("Filtro preto e branco padrão");
    }

    void pretoEBranco(String imagem, int nivel) {
        System.out.println("Filtro preto e branco com nível");
    }

    void pretoEBranco(String imagem, double opacidade) {
        System.out.println("Filtro preto e branco com opacidade");
    }

}
