package controle;

import java.util.Scanner;

public class ex056 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean stop = false;
        int numero;
        int soma = 0;

        while (!stop) {
            System.out.print("Insira um número = ");
            numero = in.nextInt();
            soma += numero;
            if (numero == 111) {
                stop = true;
                System.out.println("programa encerrado.");
            }
        }
        System.out.println("A soma é: " + soma);
    }
}
