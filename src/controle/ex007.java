package controle;

import java.util.Scanner;

public class ex007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numero;

        System.out.print("Insira um número real: ");
        numero = in.nextFloat();
        System.out.format("Dobro: %f", numero * 2);
        System.out.format("Terça parte: %f", numero / 3);
    }
}
