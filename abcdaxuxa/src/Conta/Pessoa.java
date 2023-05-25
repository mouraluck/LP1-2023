package Conta;

public class Pessoa extends Conta implements Sacar, Comprar, Dividir {
    private String CPF;

    public Pessoa(Double saldo, String CPF) {
        super(saldo);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    @Override
    public void Comprar(){

    }
    @Override
    public void Sacar(){

    }
    @Override
    public void Dividir(){
        setSaldo() = getSaldo()+ 200 ;
    }
}
