package controle;

import java.util.Scanner;

public class ex019 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //váriaveis
        String nome;
        double nota1, nota2, media;

        // entrada de dados
        System.out.print("Insira o seu nome: ");
        nome = in.nextLine();

        System.out.print("Insira primeira nota: ");
        nota1 = in.nextDouble();

        System.out.print("Insira segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println(nome);
        System.out.println("Resultado = " + media);

        if (media < 7) {
            System.out.println("Não teve um bom aproveitamento.");
        } else {
            System.out.println("Teve um bom aproveitamento.");
        }
    }
}
