package EstruturaControle;

import java.util.Scanner;

public class exer001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.print("Insira um número: ");
        numero = in.nextInt();
        if (numero == 0) {
            System.out.println(numero + " é número neutro.");
        } else if (numero < 0) {
            System.out.println(numero + " é número negativo.");
        } else {
            System.out.println(numero + " é número positivo.");
        }
    }
}
