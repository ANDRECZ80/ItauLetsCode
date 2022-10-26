package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Tabuada {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite qual a Tabuada: ");
            double tabuada = entrada.nextInt();

            for(double i = 0; i < 11; i++) {
                System.out.printf("Tabuada : %.0f X %.0f = %.0f", tabuada, i, (tabuada * i));
            }

        }
}


