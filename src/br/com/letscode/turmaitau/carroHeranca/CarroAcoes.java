package br.com.letscode.turmaitau.carroHeranca;

import br.com.letscode.turmaitau.carroHeranca.modelo.Carro;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroCorrida;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroEsportivo;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroPasseio;

public class CarroAcoes {

    public static void acelerar(Carro carro, int qtde) {

        if (carro instanceof CarroEsportivo) {
            System.out.println(" é Esportivo");
        } else if (carro instanceof CarroPasseio) {
            System.out.println(" é Passeio");
        } else if (carro instanceof CarroCorrida) {
            System.out.println(" é Corrida");
        }

        for (int i = 0; i < qtde; i++) {
            carro.acelerar();
        }

    }
}

