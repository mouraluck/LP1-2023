
package LP1ATV;

public class Clientes {
    private String Nome;
    private String CPF;
    private String Telefone;

    public Clientes(String nome, String CPF, String Telefone) {
        this.Nome = nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public void ShowC (){

        for (int i = 0; i < 45; i++) {
            System.out.print("-");

        }
        System.out.println("");
        System.out.println("| "+this.Nome+" | " + this.CPF +" | "+ this.Telefone+" |");
        for (int i = 0; i < 45; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

}
