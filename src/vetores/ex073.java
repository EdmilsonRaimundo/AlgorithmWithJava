package vetores;

import java.util.Scanner;

public class ex073 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Insira o numero da posicao " + i + ": ");
            numero[i] = in.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.print(" [" + numero[i] + "] ");
        }
    }
}
