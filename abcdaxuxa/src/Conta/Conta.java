package Conta;

abstract class Conta {
    private Double Saldo;

    public Conta(Double saldo) {
        Saldo = saldo;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo() {
        Saldo = saldo;
    }

    public void Depositar(Double valor){

        this.Saldo =+ valor;
    }
}
