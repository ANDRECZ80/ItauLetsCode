package br.com.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class CalculaCestaProdutos {

    private final static int QTDE_MAX_PRODUTOS = 5;

    Scanner scanner = null;
    RecuperaDadosProduto recuperaDadosProduto = null;

    String[] nomeProdutos;
    Double[] precoProdutos;
    Integer qtdeProdutos;

    public CalculaCestaProdutos(){

        this.scanner = new Scanner(System.in);

        this.recuperaDadosProduto = new RecuperaDadosProduto(scanner);
        this.nomeProdutos = new String[5];
        this.precoProdutos = new Double[5];
        this.qtdeProdutos = Integer.parseInt("0");
    }

    public void recuperarDadosECalcular(){

        while (this.qtdeProdutos < QTDE_MAX_PRODUTOS){

            this.nomeProdutos[qtdeProdutos] = recuperaDadosProduto.recuperarNome();
            this.precoProdutos[qtdeProdutos] = recuperaDadosProduto.recuperarPreco();

            System.out.println("Digite X para Encerrar ou outra letra para Continuar");
            boolean sair = scanner.next().equals("X");

            if (sair) {
                break;
            }
            else {
                    qtdeProdutos++;
                }

        }
        this.calcularProdutoMaisCaro();
        this.calcularProdutoMaisBarato();

    }




    private void calcularProdutoMaisCaro(){

        int indexProdutomaisCaro = 0;

        for (int i = 0; i < this.qtdeProdutos; i++){
            if (this.precoProdutos[i] > this.precoProdutos[indexProdutomaisCaro]){
                indexProdutomaisCaro = i;
            }
        }

        System.out.printf("Produto Mais Caro: %s - R$ %.2f \n",
                this.nomeProdutos[indexProdutomaisCaro],
                this.precoProdutos[indexProdutomaisCaro]);
    }

    private void calcularProdutoMaisBarato(){

        int indexProdutomaisBarato = 0;

        for (int i = 0; i < this.qtdeProdutos; i++){
            if (this.precoProdutos[i] < this.precoProdutos[indexProdutomaisBarato]){
                indexProdutomaisBarato = i;
            }
        }

        System.out.printf("Produto Mais Barato: %s - R$ %.2f \n",
                this.nomeProdutos[indexProdutomaisBarato],
                this.precoProdutos[indexProdutomaisBarato]);

        this.imprimeProduto(indexProdutomaisBarato, "barato");
    }

    private void imprimeProduto(int index, String texto){

        System.out.printf("Produto Mais %s - %s R$ %.2f \n",
                texto,
                this.nomeProdutos[index],
                this.precoProdutos[index]);
    }
}

