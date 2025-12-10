package EstruturaSequencial;

import java.util.Scanner;

public class exer003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        boolean stop = false;

        while (!stop) {
            System.out.print("Insira um número: ");
            numero = in.nextInt();
            if (numero >= 10) {
                stop = true;
                System.out.println("Loop terminou.");
            }
        }
    }
}
