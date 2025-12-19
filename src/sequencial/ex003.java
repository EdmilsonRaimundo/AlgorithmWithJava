package sequencial;

import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        float salario;

        System.out.println("**** Informações ****");
        System.out.print("Nome = ");
        nome = in.nextLine();
        System.out.print("Salário = ");
        salario = in.nextFloat();

        System.out.println("Nome do funcionário = " + nome);
        System.out.println("Salário do funcionário = " + salario);
    }
}
