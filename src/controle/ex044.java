package controle;

import java.util.Scanner;

public class ex044 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int interador, valorInicial, valorFinal, valorIncremento;

        // entrada de dados
        System.out.print("Insira o valor inicial: ");
        valorInicial = in.nextInt();
        System.out.print("Insira o valor final: ");
        valorFinal = in.nextInt();
        System.out.print("Insira o valor incremento: ");
        valorIncremento = in.nextInt();
        // vamos usar um loop para percorrer com incremto
        while (valorInicial <= valorFinal) {
            // depois de fazer a verificacao
            System.out.print(valorInicial +" ");
            // aqui e feito o incremento
            valorInicial += valorIncremento;
        }
        System.out.print("Acabou! ");
    }
}
