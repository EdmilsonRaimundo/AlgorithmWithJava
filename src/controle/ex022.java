package controle;

import java.util.Scanner;

public class ex022 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano, idade;

        System.out.print("Insira o seu ano de nascimento: ");
        ano = in.nextInt();
        idade = 2026 - ano;

        if (idade > 18) {
            System.out.println("Você tem " + idade + " anos se passaram " + (idade - 18) + " para o alistamento");
        } else {
            System.out.println("Você tem " + idade + " anos e faltam " + (18 - idade) + " para o alistamento");
        }
    }
}
