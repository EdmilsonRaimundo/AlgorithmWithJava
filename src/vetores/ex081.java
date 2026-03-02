package vetores;

import java.util.Scanner;

public class ex081 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] idades = new int[8];
        int soma = 0;
        int maior;

        // leitura das idades
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idades[i] = in.nextInt();
            soma += idades[i];
        }

        // a) média das idades
        double media = (double) soma / idades.length;
        System.out.println("\nMedia das idades: " + media);

        // b) posições com pessoas > 25 anos
        System.out.println("\nPosicoes com pessoas maiores de 25 anos:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 25) {
                System.out.println("Posicao: " + i);
            }
        }

        // c) descobrir a maior idade
        maior = idades[0];
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
            }
        }

        System.out.println("\nMaior idade digitada: " + maior);

        //d) posições da maior idade
        System.out.println("Posicoes onde a maior idade foi digitada:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == maior) {
                System.out.println("Posicao: " + i);
            }
        }
    }
}
