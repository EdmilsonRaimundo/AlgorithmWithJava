package vetores;

import java.util.Scanner;

public class ex072 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor na posição " + i + ": ");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
