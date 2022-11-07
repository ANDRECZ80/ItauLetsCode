package br.com.letscode.turmaitau.contabancaria;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaMain {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao ItauLetsCode Bank : ");
        System.out.println("Vamos abrir uma Conta Pessoa Fisica ou Juridica ? (F/J) ");

        Scanner entrada = (new Scanner(System.in));
        String pessoa = entrada.next();

        if (pessoa.toUpperCase().equals("F")) {
            PessoaFisica contaPF = new PessoaFisica();
            Conta.abreConta(contaPF, "123456", BigDecimal.ZERO);
        } else if (pessoa.toUpperCase().equals("J")) {
            PessoaJuridica contaPJ = new PessoaJuridica();
            Conta.abreConta(contaPJ,"123456", BigDecimal.ZERO);

        } else {
            System.out.println("Tipo de Pessoa Invalido !!! ");
        }

        System.out.println("Quer fazer qual operação ?");
        System.out.println("1 - Deposito      ?");
        System.out.println("2 - Saque         ?");
        System.out.println("3 - Transferencia ?");
        System.out.println("4 - Investimento  ?");
        System.out.println("5 - Consulta      ?");
        System.out.println("6 - Saida         ?");

        Scanner entrada3 = (new Scanner(System.in));
        String operacao = entrada3.next();


    }
}
