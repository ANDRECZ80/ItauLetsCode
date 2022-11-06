package br.com.letscode.turmaitau.carros;

import java.util.Arrays;

public class EncapsulamentoCarroMain{

    public static void main(String[] args) {

        Carro audi = new Carro();
        audi.setModelo("A1");
        audi.setMarca("Audi");
        audi.setCor("Branco");
        audi.setAnoFabricacao(2020);
        audi.setPlaca("XYZ12345");

        audi.ligar();
        audi.acelerar();
        audi.acelerar();

        System.out.println("audi = " + audi);

        audi.desligar();

        System.out.println("audi = " + audi);

        Carro nissan = new Carro(
                "Nissan",
                "March",
                "ABC1234",
                "preto",
                2021
        );

        System.out.println("Nissan = " + nissan);

        Carro gol = new Carro("Gol");

        System.out.println("Gol = " + gol);

    }
}
