package LP1ATV;

import java.lang.reflect.Constructor;


public class Pedidos {
    private Clientes cliente;
    private String Produto;
    private double Valor;
    private int Codigo;

    public Pedidos(Clientes cliente, String Produto, double Valor, int Codigo){
        this.cliente = cliente;
        this.Produto = Produto;
        this.Valor = Valor;
        this.Codigo = Codigo;
    }

    

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    
    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
}
