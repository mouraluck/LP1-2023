package Mundo;
public class Animal {
    public String nome;
    public int idade;
    public String barulho;

    public Animal(String n, String b, int i ){
        System.out.println(nome + " ");
    this.nome = n;
    this.idade = i;
    this.barulho = b;
    }
    public void fazerbarulho(String b){
        this.barulho= b;
        System.out.println(b);
    }
    public int envelhecer(int i){
        this.idade = i;
        i++;
        return i;
    }
    public void apresentation(){
        System.out.println();
        System.out.println("Có! my name is "+ this.nome + " " + this.barulho + ", i'm a rooster and i'm " + this.idade + " years old");
    }
}
