package com.atividade;

public class Gastos {
    private Number Valor;
    private String Nome;

    public Gastos(Number valor, String nome) {
        Valor = valor;
        Nome = nome;
    }

    public Number getValor() {
        return Valor;
    }

    public void setValor(Number valor) {
        Valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void MudarValor (Number Valor){
        int value = (int) this.Valor;
        value = (value + (value*5)/100);
        this.Valor = value;
        System.out.println("\n"+ this.Valor);
    }
}