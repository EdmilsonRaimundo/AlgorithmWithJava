package vetores;

import java.util.Scanner;

public class ex077 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Insira o nome na posição " + i + ": ");
            nomes[i] = in.next();
        }

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(" [" + nomes[i] + "] ");
        }
    }
}
