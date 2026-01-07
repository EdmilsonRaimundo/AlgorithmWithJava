package controle;

import java.util.Scanner;

public class ex041 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 100;
        while (numero >= 0) {
            System.out.print(numero + " ");
            numero -= 5;
        }
    }
}
