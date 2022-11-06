package br.com.letscode.turmaitau.carroHeranca.modelo;

public class CarroPasseio extends Carro{


    public CarroPasseio(String marca, String modelo, String placa, String cor, Integer anoFabricacao) {
        super(marca, modelo, placa, cor, anoFabricacao);
    }

    @Override
    public void acelerar() {
        super.acelerar(5);
    }
}
