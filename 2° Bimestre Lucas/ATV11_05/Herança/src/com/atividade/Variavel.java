package com.atividade;

public class Variavel extends Gastos {
    private Integer TempoMeses;

    public Variavel(Number valor, String nome, Integer tempoMeses) {
        super(valor, nome);
        TempoMeses = tempoMeses;
    }

    public Integer getTempoMeses() {
        return TempoMeses;
    }

    public void setTempoMeses(Integer tempoMeses) {
        TempoMeses = tempoMeses;
    }
}
