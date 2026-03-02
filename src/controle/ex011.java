package controle;

import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta;

        // entrada de dados
        System.out.print("Entre com valor de A: ");
        a = in.nextDouble();
        System.out.print("Entre com valor de B: ");
        b = in.nextDouble();
        System.out.print("Entre com valor de C: ");
        c = in.nextDouble();
        // calculando o valor de delta
        delta = Math.pow(b, 2) - 4 * a * c;
        // exibindo o valor de delta
        System.out.println("O valor de delta da 2 segunda equação é: " + delta);
    }
}
