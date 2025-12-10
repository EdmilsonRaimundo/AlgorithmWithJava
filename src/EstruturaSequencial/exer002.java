package EstruturaSequencial;

import java.util.Scanner;

public class exer002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        
        System.out.print("Insira um número para contagem: ");
        numero = in.nextInt();
        for(int i = 0; i <= numero; i++) { 
            System.out.println(i);
        }
    }
}
