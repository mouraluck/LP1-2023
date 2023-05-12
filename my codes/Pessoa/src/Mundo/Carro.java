package Mundo;

public class Carro {
    public int Distancia;
    public String Tracao;
    public long Potencia;
    public float classification;
    

    public void Carro(String oeoe,int distancia, String tracao, long potencia, float classification){
System.out.println("Inicio de execução, metodo gol");

System.out.println(oeoe);
for (int i = 0; i < 18; i++) {
    System.out.print("_");
}
System.out.println("\nCarro do modelo: Gol");
        for (int i = 0; i < 18; i++) {
            System.out.print("_");
        }
System.out.println("\nTração "+ this.Tracao + "\n"+this.Distancia + " KM rodados \n" + this.Potencia + " Cavalos");
        for (int i = 0; i < 18; i++) {
            System.out.print("_");
        }    
System.out.println();
}
    public int getDistancia() {
        return Distancia;
    }

    public String getTracao() {
        return Tracao;
    }

    public long getPotencia() {
        return Potencia;
    }

    public float getClassification() {
        return classification;
    }

    public void setTracao(String tracao) {
        Tracao = tracao;
    }

    public void setPotencia(long potencia) {
        Potencia = potencia;
    }

    public void setClassification(float classification) {
        this.classification = classification;
    }
}


