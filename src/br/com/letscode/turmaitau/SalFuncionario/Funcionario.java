package br.com.letscode.turmaitau.SalFuncionario;

import java.math.BigDecimal;
import java.util.Objects;

    public class Funcionario {

        String nome;
        String cpf ;
        BigDecimal salario;

        public Funcionario() {

        }

        public Funcionario (String nome){
            this.setNome(nome);
        }

    BigDecimal calcSalario(Integer dias){

        BigDecimal sal;

        if (dias == 0) {
            return BigDecimal.valueOf(0.0);
        } else {
           // return (salario / 30) * dias;
            sal = BigDecimal.valueOf(salario.doubleValue() / 30);
            return BigDecimal.valueOf(sal.doubleValue() * dias);
        }
    }
        void imprimirtoString(){
            System.out.println("this = " + this.toString());
            System.out.println("super = " + super.toString());
            System.out.println("this = " + this.hashCode());
            System.out.println("super = " + super.hashCode());
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Funcionario{");
            sb.append("nome='").append(nome).append('\'');
            sb.append(", cpf='").append(cpf).append('\'');
            sb.append(", salario=").append(salario);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Funcionario that = (Funcionario) o;
            return Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(salario, that.salario);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, cpf, salario);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public BigDecimal getSalario() {
            return salario;
        }

        public void setSalario(BigDecimal salario) {
            this.salario = salario;
        }
    }
