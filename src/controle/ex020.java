package controle;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        
        System.out.print("Insira um número qualquer inteiro e positivo: ");
        numero = in.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Número " + numero + " é PAR");
        } else { 
            System.out.println("Número " + numero + " é ÍMPAR");
        }
    }   
}
