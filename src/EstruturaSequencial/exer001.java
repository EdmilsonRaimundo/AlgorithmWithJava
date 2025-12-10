package EstruturaSequencial;

import java.util.Scanner;

public class exer001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("========== entrada de dados ==========");
        System.out.println("Insira o seu nome: ");
        nome = in.nextLine();
        System.out.println("Insira a sua idade: ");
        idade = in.nextInt();
        System.out.println("Olá "+ nome +"! você tem "+ idade +" anos.");       
    }
}
