package sequencial;

import java.util.Scanner;

public class ex004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2, soma;

        System.out.print("Entre com o primeiro número: ");
        numero1 = in.nextInt();
        System.out.print("Entre com o segundo número: ");
        numero2 = in.nextInt();
        soma = (numero1 + numero2);
        System.out.println("Total da soma = " + soma);
    }
}
