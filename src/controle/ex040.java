package controle;

import java.util.Scanner;

public class ex040 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 0;
        while (numero <= 20) {
            System.out.print(numero + " ");
            numero += 3;
        }
    }
}
