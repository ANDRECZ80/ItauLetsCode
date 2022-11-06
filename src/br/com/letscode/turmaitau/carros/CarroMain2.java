package br.com.letscode.turmaitau.carros;

public class CarroMain2 {
    public static void main(String[] args){

        Carro golBranco = new Carro();
        golBranco.setModelo(new String("Gol"));
        golBranco.setCor("Branco");

        Carro golPreto = new Carro();
        golPreto.setModelo("Gol");
        golPreto.setCor("Preto");

        golBranco.imprimirtoString();
        golPreto.imprimirtoString();

        if (golPreto.equals(golBranco)){ //comparacao de objetos
            System.out.println("Sao Iguais");
        } else {
            System.out.println("Sao diferentes");
        }

        if (golPreto == golBranco){  //comparacao de referencia de memoria
            System.out.println("Sao Iguais 2");
        } else {
            System.out.println("Sao diferentes 2");
        }

        if (golPreto.toString().equals(golBranco.toString())){ //comparacao de strings
            System.out.println("Sao Iguais3");
        } else {
            System.out.println("Sao diferentes3");
        }

        if (golBranco instanceof Carro) {
            System.out.println("gol Branco é um carro");
        }
        if (golPreto instanceof Carro) {
            System.out.println("gol preto é um carro");
        }
        if (golPreto instanceof Object) {
            System.out.println("gol Branco é um Objeto");
        }
    }
}

