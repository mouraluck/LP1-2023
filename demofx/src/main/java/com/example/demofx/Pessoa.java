package com.example.demofx;

public class Pessoa {
    String Nome;
    Integer CPF;

    Integer Idade;

    public Pessoa(String nome, Integer CPF, Integer idade) {
        Nome = nome;
        this.CPF = CPF;
        Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", CPF=" + CPF +
                ", Idade=" + Idade +
                '}';
    }
}
