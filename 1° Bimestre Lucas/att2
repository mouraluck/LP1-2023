import java.util.Arrays;
import java.util.Scanner;
    public class inutei 
{
        public static void main(String[] args) 
        {

            String[][] lincol = new String [3][3];
                        for (int i = 0; i < lincol.length; i++) {
                            Arrays.fill(lincol[i], "[ ]");
                        }
            
            
            
            Scanner li = new Scanner(System.in);
            
                        do{
                            boolean tab = exibirTabuleiro(lincol);
                            System.out.println("\n\nJogador x entre com linha e coluna, respectivamente, e com espaço.");
                            
                            int lc1 = li.nextInt();
                            int lc2 = li.nextInt();
                            lincol[lc1][lc2] = "[x]"; 
                            boolean victory = vitoria(lincol);
                                if (victory == true)
                                {
                                    System.out.println("\n\nyou win!!");
                                }
                                boolean taba = exibirTabuleiro(lincol);
                            System.out.println("\n\nJogador o entre com linha e coluna, respectivamente, e com espaço.");
                            
                            int lc3 = li.nextInt();
                            int lc4 = li.nextInt();
                            lincol[lc3][lc4] = "[o]"; 
                            vitoria(lincol);
                            if (victory == true){
                                System.out.println("\n\nyou win!!");
                            }
                            
                        } while (!vitoria(lincol));

            li.close();
        }
        

        public static boolean vitoria(String[][] lincol) {
            

            if (lincol[0][0] == "[x]" && lincol[0][1] == "[x]" && lincol[0][2] == "[x]" || lincol[0][0] == "[o]" && lincol[0][1] == "[o]" && lincol[0][2] == "[o]") {
               
                return true;
            } else if (lincol[1][0] == "[x]" && lincol[1][1] == "[x]" && lincol[1][2] == "[x]" || lincol[1][0] == "[o]" && lincol[1][1] == "[o]" && lincol[1][2] == "[o]") {
                return true;
            } else if (lincol[2][0] == "[x]" && lincol[2][1] == "[x]" && lincol[2][2] == "[x]" || lincol[2][0] == "[o]" && lincol[2][1] == "[o]" && lincol[2][2] == "[o]") {
                return true;
            } else if (lincol[0][0] == "[x]" && lincol[1][0] == "[x]" && lincol[2][0] == "[x]" || lincol[0][0] == "[o]" && lincol[1][0] == "[o]" && lincol[2][0] == "[o]") {
                return true;
            } else if (lincol[0][1] == "[x]" && lincol[1][1] == "[x]" && lincol[2][1] == "[x]" || lincol[0][1] == "[o]" && lincol[1][1] == "[o]" && lincol[2][1] == "[o]") {
                return true;
            } else if (lincol[0][2] == "[x]" && lincol[1][2] == "[x]" && lincol[2][2] == "[x]" || lincol[0][2] == "[o]" && lincol[1][2] == "[o]" && lincol[2][2] == "[o]") {
                return true;
            } else if (lincol[0][0] == "[x]" && lincol[1][1] == "[x]" && lincol[2][2] == "[x]" || lincol[0][0] == "[o]" && lincol[1][1] == "[o]" && lincol[2][2] == "[o]") {
                return true;
            } else if (lincol[0][2] == "[x]" && lincol[1][1] == "[x]" && lincol[2][0] == "[x]" || lincol[0][2] == "[o]" && lincol[1][1] == "[o]" && lincol[2][0] == "[o]") {
                return true;
            } else {
                return false;
            }
            
            
        }

        

        public static boolean exibirTabuleiro(String[][] lincol) {
            System.out.printf("\n  0   1   2 ");
            for (int l = 0; l < 3; l++) {
                System.out.println(" ");
                System.out.print("" + l);
                for (int c = 0; c < 3; c++) {
                    System.out.print(lincol[l][c]);
                    System.out.print(" ");
                }
            }

            return true;
        }

        public static boolean empate(boolean oi) {
            if (oi == false){
                return true;}
            else{return false;
            }
        }


}

