package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class ex079 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        ArrayList<Integer> numerosPares = new ArrayList<>();

        // entrada de dados no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor da posicao " + (i + 1) + " = ");
            numeros[i] = in.nextInt();
        }
        System.out.println("-------------------------------------");
        // saída de dados no vetor
        for (int i = 0; i < numeros.length; i++) {
            // verificando se é par
            if (numeros[i] % 2 == 0) {
                // marcando os numeros pares
                System.out.print("[" + numeros[i] + "]");
                numerosPares.add(numeros[i]);
            } else {
                // dando sequencia na saída de dados
                System.out.print(numeros[i] + "");
            }
        }
        
        // mostrar somente os numeros pares na tela
        System.out.println("\nOs numeros pares sao: " + numerosPares);
    }
}
