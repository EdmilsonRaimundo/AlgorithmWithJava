package ArraysAndMatrizes;

import java.util.Scanner;

public class exer002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Na posição [" + i + "][" + j + "] = ");
                numeros[i][j] = in.nextInt();
            }
        }

        for (int[] linha : numeros) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
