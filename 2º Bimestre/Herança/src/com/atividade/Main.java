package com.atividade;

public class Main {
    public static void main(String[] args) {
        System.out.println("inicio do mundo");
        Gastos gastos = new Gastos(2000, "Academia");

        gastos.MudarValor(gastos.getValor());
        
    }
}
