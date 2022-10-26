package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Cotacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a Cotacao do Dolar: ");
        double cotacao = entrada.nextDouble();

        System.out.println("Digite o Total em Dolares: ");
        double vlrtotal = entrada.nextDouble();

        System.out.printf("Total em Reais : %.2f", (cotacao * vlrtotal));


    }

}
