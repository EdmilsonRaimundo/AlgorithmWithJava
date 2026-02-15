package controle;

import java.util.Scanner;

public class ex021 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;

        System.out.print("Insira o ano para verificar se é ou não ano bissexto: ");
        ano = in.nextInt();
        if ((ano % 4 == 0 && 100 != 0) ||(ano % 100 == 0)) {
            System.out.println(ano + " ano bissexto!");
        } else {
            System.out.println(ano + " Não é ano bissexto!");
        }       
    }
}
