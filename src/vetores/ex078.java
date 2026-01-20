package vetores;

import java.util.Scanner;

public class ex078 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("insira o valor da posicao [" + i + "] = ");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.print("["+ numeros[i] +"]");
            } else {
                System.out.print(" " + numeros[i] + " ");
            }
        }
    }
}
