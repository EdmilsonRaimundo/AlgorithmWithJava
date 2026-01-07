package sequencial;

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Primeira nota: ");
        nota1 = in.nextDouble();
        System.out.print("Segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

    }
}
