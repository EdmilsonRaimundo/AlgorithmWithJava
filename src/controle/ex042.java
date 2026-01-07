package controle;

import java.util.Scanner;

public class ex042 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //variaveis
        int i = 0, numero;
        
        //entrada de dados 
        System.out.print("Insira um valor inteiro e positivo: ");
        numero = in.nextInt();
        
        while (i <= numero) {
            System.out.print(i + " ");
            i++;
        }
    }
}
