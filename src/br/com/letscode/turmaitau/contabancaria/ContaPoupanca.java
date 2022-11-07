package br.com.letscode.turmaitau.contabancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public void depositar(BigDecimal valor) {
        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(1.5)).add(valor);
        super.adicionarDinheiro(valorDepositado);
    }
}
