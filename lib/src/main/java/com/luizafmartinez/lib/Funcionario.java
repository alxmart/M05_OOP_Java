package com.luizafmartinez.lib;

public class Funcionario {

    double salario = 0.0;

    // Método void => Método sem retorno
    // void calcularSalarioDesconto() {

    // Método COM retorno
    double calcularSalarioDesconto(double bonus) {

        double totalComDesconto = salario - 20.00 + bonus;

        return totalComDesconto;
    }
}
