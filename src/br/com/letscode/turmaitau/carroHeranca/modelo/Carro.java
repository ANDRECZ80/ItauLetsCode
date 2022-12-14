package br.com.letscode.turmaitau.carroHeranca.modelo;

import java.util.Objects;

public abstract class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Integer anoFabricacao = null;
    private boolean ligado = false;
    private Integer  velocidade = 0;

    public Carro(String marca, String modelo, String placa, String cor, Integer anoFabricacao ){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.setPlaca(placa);
        this.setCor(cor);

    }

    public void ligar(){
        if (!ligado) {
            this.ligado = true;
        }
    }

    public abstract void acelerar();


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean isLigado() {
        return ligado;
    }


    public Integer getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(Integer velocidade){
        this.velocidade = velocidade;
    }

    protected void acelerar(int velocidadeAdicional){
        if (isLigado()){
            this.velocidade = this.velocidade + velocidadeAdicional;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", anoFabricacao=").append(anoFabricacao);
        sb.append(", ligado=").append(ligado);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(placa, carro.placa) && Objects.equals(cor, carro.cor) && Objects.equals(anoFabricacao, carro.anoFabricacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, placa, cor, anoFabricacao);
    }
}
