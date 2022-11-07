package br.com.letscode.turmaitau.contabancaria;

import java.math.BigDecimal;
import java.util.Scanner;

public abstract class Conta {

    private String numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    public Conta(String numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    protected abstract void depositar(BigDecimal valor);

    protected void adicionarDinheiro (BigDecimal valor) {
        this.saldo = saldo.add(valor);
    };

    public void sacar(){

    };

    public void transferir(){


    };

    public static void abreConta (Pessoa pessoa, String numero, BigDecimal Saldo){

        if (pessoa instanceof PessoaFisica){
            // abrir CC, CI e CP
            System.out.println("Vamos Conta Corrente, Investimento ou Poupança ? (C/I/P) ");
            abreTipoConta();
        } else if (pessoa instanceof PessoaJuridica) {
            //abrir CC ou CI
            System.out.println("Vamos Conta Corrente ou Investimento ? (C/I) ");
            abreTipoConta();
        }
    }

    public static void abreTipoConta () {

        Scanner entrada2 = (new Scanner(System.in));
        String tipconta = entrada2.next();

        if (tipconta.toUpperCase().equals("C")) {
            ContaCorrente contaCorrente = new ContaCorrente("12345", BigDecimal.ZERO);
            System.out.println("Conta Corrente Aberta = " + contaCorrente.toString());
        } else if (tipconta.toUpperCase().equals("I")) {
            ContaInvestimento contaInvestimento = new ContaInvestimento("12345", BigDecimal.ZERO);
            System.out.println("Conta Investimento Aberta = " + contaInvestimento.toString());
        } else if (tipconta.toUpperCase().equals("P")) {
            ContaPoupanca contaPoupanca = new ContaPoupanca("12345", BigDecimal.ZERO);
            System.out.println("Conta Poupança Aberta = " + contaPoupanca.toString());
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
