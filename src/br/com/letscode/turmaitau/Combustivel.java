package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Tempo Gasto na Viagem : ");
        double tempo = entrada.nextDouble();

        System.out.println("Velocidade Media : ");
        double velmedia = entrada.nextDouble();

        double distancia = tempo * velmedia;

        double ltsusados = distancia / 12;


        System.out.printf("A Distancia foi de    : %.2f Kms\n", distancia);
        System.out.printf("A Veloc. Media foi de : %.2f Km/h\n", velmedia);
        System.out.printf("O Tempo foi de        : %.2f hora(s)\n", tempo);
        System.out.printf("Foi utilizado %.2f litros de Combustivel\n", ltsusados);


    }

}
