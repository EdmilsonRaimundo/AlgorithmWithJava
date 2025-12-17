package controle;

import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoNascimento, anoAtual, idade;

        System.out.print("Insira o seu ano de nascimento: ");
        anoNascimento = in.nextInt();

        System.out.print("Insira o ano atual: ");
        anoAtual = in.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }
    }
}
