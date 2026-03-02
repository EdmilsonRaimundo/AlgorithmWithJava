package controle;

import java.util.Scanner;

public class ex025 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double reta1, reta2, reta3;

        // entrada de dados
        System.out.print("Insira o valor da reta 1 = ");
        reta1 = in.nextDouble();
        System.out.print("Insira o valor da reta 2 = ");
        reta2 = in.nextDouble();
        System.out.print("Insira o valor da reta 3 = ");
        reta3 = in.nextDouble();
        // fazendo a verificação para saber se forma um triângulo ou não
        if ((reta1 < (reta2 + reta3)) && (reta2 < (reta1 + reta3)) && (reta3 < (reta2 + reta1))) {
            // exibi a mensagem de que pode formar um triângulo.
            System.out.println("Pode formar um triângulo.");
        } else {
            // exibi a mensagem de que nao pode formar um triangulo.
            System.out.println("Não pode formar um triângulo");
        }
    }
}
