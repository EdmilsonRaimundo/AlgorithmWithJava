package matrizes;

import java.util.Scanner;

/*
Maior elemento
Leia uma matriz 4x4 e mostre o maior número.
 */
public class ex103 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[4][4];
        int maiorNumero = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Insira o valor da posicao [" + i + "][" + j + "] = ");
                numeros[i][j] = in.nextInt();

                if (maiorNumero < numeros[i][j]) {
                    maiorNumero = numeros[i][j];
                }
            }
        }

        System.out.println("==================== RESULTADO ====================");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println();
        }
        
        System.out.println("Maior numero = " + maiorNumero);
    }
}
