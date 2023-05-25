package Conta;

public class Empresa extends Conta implements Sacar, Dividir{
    private String CNPJ;

    public Empresa(Double saldo, String CNPJ) {
        super(saldo);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    @Override
    public void Sacar(){

    }
    @Override
    public void Dividir(){

    }
}
