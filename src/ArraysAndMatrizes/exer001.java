package ArraysAndMatrizes;

import java.util.Scanner;

public class exer001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Na posição " + (i + 1) + " insira o valor: ");
            numeros[i] = in.nextInt();
        }
        System.out.println("===== Resultado =====");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
