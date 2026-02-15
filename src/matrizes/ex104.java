package matrizes;

import java.util.Scanner;

/*
Soma das linhas
Leia uma matriz 3x3 e mostre a soma de cada linha.
Linha 1: 12  
Linha 2: 8  
Linha 3: 15
 */
public class ex104 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Insira o valor da posicao [" + i + "][" + j + "] = ");
                numeros[i][j] = in.nextInt();

            }
        }

        System.out.println("================== RESULTADO ==================");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            soma = 0;
            for (int j = 0; j < numeros[i].length; j++) {
                soma += numeros[i][j];
            }
            System.out.println("Linha " + i + " = " + soma);
        }

    }
}
