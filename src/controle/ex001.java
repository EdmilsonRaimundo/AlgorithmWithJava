package controle;

import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float velocidade, multa;

        System.out.print("Insira a velocidade do seu veículo: ");
        velocidade = in.nextFloat();

        if (velocidade > 80) {
            multa = velocidade * 5;
            System.out.println("Excedeu o limite de velocidade.");
            System.out.println("Total a pagar por essa multa é: " + multa);
        } else {
            System.out.println("Não excedeu o limite de velociade.");
            System.out.println("Boa viagem.");
        }
    }
}
