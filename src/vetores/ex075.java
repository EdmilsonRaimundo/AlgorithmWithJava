package vetores;

import java.util.Scanner;

public class ex075 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[15];
        numeros[0] = 0;
        numeros[1] = 1;

        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i - 1] + numeros[i - 2];
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
