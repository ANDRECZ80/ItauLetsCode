package br.com.letscode.turmaitau.carros;

import java.util.Objects;

public class Carro  {

    /*  atributos
        modificadores de acesso

        public
        private
        protected
        default
    */
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Integer anoFabricacao;

    private int velocidade = 0;
    private boolean ligado = false;

    public Carro(){


    }

    public Carro(String marca, String modelo, String placa, String cor, Integer anoFabricacao ){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setCor(cor);
        this.setAnoFabricacao(anoFabricacao);
    }

    public Carro(String marca){
        this.setMarca(marca);
    }
    void ligar(){
        if (!ligado) {
            this.ligado = true;
        }
    }

    void acelerar(){
        if (ligado) {
            this.velocidade = this.velocidade + 10;
        }
    }

    void desligar(){
        this.ligado = false;
        this.velocidade = 0;
    }

    void imprimirtoString(){
        System.out.println("this = " + this.toString());
        System.out.println("super = " + super.toString());
        System.out.println("this = " + this.hashCode());
        System.out.println("super = " + super.hashCode());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", anoFabricacao=").append(anoFabricacao);
        sb.append(", velocidade=").append(velocidade);
        sb.append(", ligado=").append(ligado);
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() == 7) {
            this.placa = placa;
        }
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

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

