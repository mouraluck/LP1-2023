package LP1ATV;

public class Main{
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Isabella", "518.874.057-48", "(11)940028922");
        Clientes cliente2 = new Clientes("Mateus", "295.634.744-38", "(11)925573648");
        Clientes cliente3 = new Clientes("Jusefa", "275.674.369-29", "(11)925573648");
        Loja loja = new Loja("Xtore");

        loja.addpedidos(new Pedidos(cliente1, "Macarrão", 23.5, 2334));
        loja.addpedidos(new Pedidos(new Clientes ("Maris", "235.734.235-64", "(11)92267488"), "batata", 5.0, 2947));
        loja.addpedidos(new Pedidos (cliente1, "bis extra", 4.0 , 0001));
        loja.addpedidos(new Pedidos(cliente1, "Trufa", 3.0, 0002 ));
        loja.addclientes(cliente1);
        loja.addclientes(cliente2);
        loja.addclientes(cliente3);
        System.out.println("\t\t\tClientes Registrados");
        loja.mostrar();
        

    }
   

} 