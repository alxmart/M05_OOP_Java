package com.luizafmartinez.lib;

public class RunCarrinhoCompras {

    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();

        double valFrete = carrinho.calcularValorFrete("12112-234");

        System.out.println("Valor frete: " + valFrete);
    }
}
