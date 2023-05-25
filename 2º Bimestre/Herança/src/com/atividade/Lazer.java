package com.atividade;

public class Lazer extends Gastos{
private Boolean importante;

    public Lazer(Number valor, String nome, Boolean importante) {
        super(valor, nome);
        this.importante = importante;
    }

    public Boolean getImportante() {
        return importante;
    }

    public void setImportante(Boolean importante) {
        this.importante = importante;
    }
}
