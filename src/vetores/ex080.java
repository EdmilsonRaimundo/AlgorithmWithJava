package vetores;

import java.util.Random;
import java.util.Scanner;

public class ex080 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] numeros = new int[30];
        int numero, qtdNumeros = 0;

        // entrada de números aleatorios de 1 até 15 no array de 30 posições.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(15) + 1;
        }
        // pedir ao usuário digirar um número inteiro
        System.out.print("Digite um número inteiro de 1 ate 15 = ");
        numero = in.nextInt();
        // vamos fazer a verificação do valor
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                System.out.println("Encotrado na posicao: " + i);
                qtdNumeros += 1;
            }
        }
        System.out.println("-------------------------------------");
        // saída do array de 30 posições de valores aleatoriamente no array
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nApareceu " + qtdNumeros + " vezes.");
    }
}
