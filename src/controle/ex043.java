package controle;

import java.util.Scanner;

public class ex043 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // criando um interador
        int interador = 30;
        // percorrendo
        while (interador >= 1) {
            if (interador % 4 == 0) {
                // identificando o numeros divisiveis por 4
                System.out.print("[" + interador + "] ");
            } else {
                // dando sequencia na interacao
                System.out.print(interador + " ");
            }
            // decremento
            interador--;
        }
    }
}
