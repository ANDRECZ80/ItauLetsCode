package br.com.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class RecuperaDadosProduto {

    public Scanner scanner;
    public RecuperaDadosProduto(Scanner scanner){
        this.scanner = scanner;
    }

    public String recuperarNome(){
        System.out.println("Digite Nome do Produto: ");
        String nome = scanner.next();
        return nome;
    }

    public Double recuperarPreco(){
        System.out.println("Digite Valor do Produto: ");
        Double valor = scanner.nextDouble();
        return valor;
    }
}
