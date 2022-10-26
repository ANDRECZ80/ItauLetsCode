package br.com.letscode.turmaitau;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a operação: ");
        System.out.println("1 - somar; 2 - Subtrair; 3 - dividir; 4 - Multiplicar");
        int operacao = entrada.nextInt();

        if (operacao == 1) {
            System.out.printf("Resultado: %f", (numero1 + numero2));
        } else if (operacao == 2) {
            System.out.printf("Resultado: %f", (numero1 - numero2));
        } else if (operacao == 3) {
            System.out.printf("Resultado: %f", (numero1 / numero2));
        } else if (operacao == 4) {
            System.out.printf("Resultado: %f", (numero1 * numero2));
        }

    }
}
