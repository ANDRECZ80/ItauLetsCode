package br.com.letscode.turmaitau.carroHeranca;

import br.com.letscode.turmaitau.carroHeranca.modelo.*;

public class CarroHerancaMain {

    public static void main(String[] args) {

        Carro carroPasseio = FabricaCarros.fabricarCarro(
                "Volks",
                "Gol",
                "ABC1234",
                "Verde",
                2022,
                "passeio"
        );

        carroPasseio.ligar();
        CarroAcoes.acelerar(carroPasseio, 3);

        System.out.println("Carro Passeio = " + carroPasseio);

        Carro carroEsportivo = FabricaCarros.fabricarCarro(
                "Ferrari",
                "Modena",
                "AAA1234",
                "Vermelha",
                2021,
                "esportivo"
        );

        carroEsportivo.ligar();
        CarroAcoes.acelerar(carroEsportivo, 3);

        System.out.println("Carro Esportivo = " + carroEsportivo);

        Carro carroCorrida = FabricaCarros.fabricarCarro(
                "Ferrari",
                "XYZ",
                "",
                "Vermelha",
                2021,
                "corrida"
        );

        carroCorrida.ligar();
        CarroAcoes.acelerar(carroCorrida, 3);

        System.out.println("Carro Corrida = " + carroCorrida);


    }
}
