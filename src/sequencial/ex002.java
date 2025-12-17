package sequencial;

import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        
        System.out.print("Insira o seu nome: ");
        nome = in.nextLine();
        
        System.out.println(nome+" Seja bem-vindo.");
    }
}
