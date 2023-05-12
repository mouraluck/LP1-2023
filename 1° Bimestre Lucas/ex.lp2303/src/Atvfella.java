import java.util.Scanner;
public class Atvfella {
    public static void main(String[] args) {
String[] nomes = new String[4];
double[][] contas = new double[4][4];
Scanner nosmi = new Scanner(System.in);
Scanner in = new Scanner(System.in);

boolean uepa = allvalues(contas);
for (int i= 1; i<4; i++) {
    System.out.println("\n\nType a name " + i);
    nomes[i] = nosmi.next();}
boolean ratinhoo = allname(nomes);
for (int i= 0; i<4;i++) {
    System.out.println("Type a Interger number: ");
    int inter = in.nextInt();
    System.out.println(inter);
    boolean elegosta = verify(inter, nomes);}
boolean uuui = tablefin(contas);
    }


    public static boolean allname (String[] nomes){
System.out.println(nomes[1]+ " " + nomes[2] + " "+ nomes[3]);
    return true;}


    public static boolean allvalues (double[][] contas){
        for(int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++){
                System.out.print(contas[i][j]);}
        }return true;}

   public static boolean verify (int inter, String [] nomes){
        if (inter == 1){
            System.out.println(nomes[1]);}
        else if (inter>1 && inter<=10) {
            System.out.println(nomes[2]);}
        else if (inter>10){
            System.out.println(nomes[3]);}
        else {
            System.out.println("opção invalida");
        }
        return true;
   }


   public static boolean tablefin (double[][] contas ){
       Scanner oi = new Scanner(System.in);
           System.out.println("Type the 1st number: ");
           int n1 = oi.nextInt();
       System.out.println("Type the 2st number: ");
       int n2 = oi.nextInt();
       System.out.println("Type the 3st number: ");
       int n3 = oi.nextInt();

       contas [0][0] = 0;
       contas [0][1] = n1;
       contas [0][2] = n2;
       contas [0][3] = n3;
       contas [1][0] = n1;
       contas [2][0] = n2;
       contas [3][0] = n3;
       contas [1][1] = n1*n1;
       contas [1][2] = n1-n2;
       contas [1][3] = n1-n3;
       contas [2][1] = n2*n1;
       contas [2][2] = n2*n2;
       contas [2][3] = n2-n3;
       contas [3][1] = n3-n1;
       contas [3][2] = n3-n2;
       contas [3][3] = n3*n3;

       for (int i = 0; i < 4; i++) {
           System.out.println("\n");
           for (int j = 0; j < 4; j++) {
               System.out.print("|"+ contas[i][j]+"|");

           }
       }

        return true;
   }
}
