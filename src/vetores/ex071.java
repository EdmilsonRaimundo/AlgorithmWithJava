package vetores;

import java.util.Scanner;

public class ex071 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira valor na posição " + (i + 1) + " = ");
            numeros[i] = in.nextInt();
        }

        System.out.println("***** Resutlado *****");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
