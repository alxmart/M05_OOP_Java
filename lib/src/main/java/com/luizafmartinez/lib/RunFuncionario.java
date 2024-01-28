package com.luizafmartinez.lib;

public class RunFuncionario {

    public static void main(String[] args) {

        Funcionario zeruela = new Funcionario();
        zeruela.salario = 1000.00;

        double salarioTotal = zeruela.calcularSalarioDesconto(80.00);

        System.out.println("Total salario: " + salarioTotal);
    }
}
