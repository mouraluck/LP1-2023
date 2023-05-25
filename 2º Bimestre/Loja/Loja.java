package LP1ATV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Clientes> clients = new ArrayList<Clientes>();
    private List<Pedidos> pedidos = new ArrayList<Pedidos>();

    public Loja(String nome) {
    this.nome = nome;

    }

    public List<Clientes> getClients() {
        return clients;
    }
    public void setClients(List<Clientes> clients) {
        this.clients = clients;
    }
    public List<Pedidos> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addpedidos(Pedidos pedidos) {

        this.pedidos.add(pedidos);
    }
    public void addclientes(Clientes clientes) {

        this.clients.add(clientes);
    }

    public void mostrar(){
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).ShowC();
        }
    }

}
