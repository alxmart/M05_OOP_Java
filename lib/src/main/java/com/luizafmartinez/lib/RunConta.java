package com.luizafmartinez.lib;

public class RunConta {

    public static void main(String[] args) {

        Conta conta = new Conta("120123","123456");

        conta.sacar();
        conta.transferir();

    }
}
