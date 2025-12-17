package matrizes;

import java.util.Scanner;

public class ex100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[2][2];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Insira o valor na posicao [" + i + "]X[" + j + "] = ");
                numeros[i][j] = in.nextInt();
            }
        }
        System.out.println("**** RESULTADO ****");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println();
        }
    }
}
