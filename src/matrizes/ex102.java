package matrizes;

import java.util.Scanner;

/* 
Contar números pares 
Leia uma matriz 3x3 e diga quantos números pares existem nela.
 */
public class ex102 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Insira o valor da posicao [" + i + "][" + j + "] = ");
                numeros[i][j] = in.nextInt();

                if (numeros[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        
        System.out.println("=============== RESULTADO ===============");
        for (int i = 0; i < numeros.length; i++) { 
            for (int j = 0; j < numeros[i].length; j++) { 
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println();
        }
        
        System.out.println("Quantidade de numeros pares = " + pares);
    }
}
