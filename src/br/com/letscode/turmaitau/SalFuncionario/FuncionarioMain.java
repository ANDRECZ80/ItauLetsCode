package br.com.letscode.turmaitau.SalFuncionario;

import java.math.BigDecimal;
import java.util.Scanner;

public class FuncionarioMain {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos dias o funcionario trabalhou ? : ");
        Integer dias = entrada.nextInt();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("André Cruz");
        funcionario.setCpf("274.087.128-79");
        funcionario.setSalario(BigDecimal.valueOf(1000.0));

        System.out.printf("O Salario proporcional é de: R$ %.4f \n", funcionario.calcSalario(dias));

        funcionario.imprimirtoString();

        Funcionario func2 = new Funcionario("Ana Claudia");

        func2.imprimirtoString();

    }
}
