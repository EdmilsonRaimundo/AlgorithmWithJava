package matrizes;

import java.util.Scanner;

public class ex101 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        int soma = 0;
        /*
        Exercício 2 – Soma dos elementos
        Crie uma matriz 3x3 já inicializada com valores.
        Mostre a soma de todos os elementos da matriz.
         */

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Insira [" + i + "]x[" + j + "] = ");
                numeros[i][j] = in.nextInt();
                soma += numeros[i][j];
            }
            
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total da soma é: " + soma);
    }
}
