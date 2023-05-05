package LP1ATV;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Clientes {
    String[][] Nomes = String[10][10];
    public String Nome;
    public int Cpf;
    public int Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int cpf) {
        Cpf = cpf;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> Nomes = new ArrayList();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Nomes.add("a");
            }
        }

        System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");

        for (String contato: Nomes) {
            i = 0;
            System.out.printf("Posição %d- %s\n", i, contato);
            i++;
        }
    }
    public void ShowC(){

    }

}
