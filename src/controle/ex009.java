package controle;

import java.util.Scanner;

public class ex009 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double real, dolar;

        //primeiro vou perguntar valor que tem na carteira do usuario.
        System.out.println("======= conversão de moeda =======");
        System.out.println("Quanto é que tem na carteira?");
        real = in.nextDouble();
        //agora aqui vou fazer a conversão de reais para dolar
        dolar = real / 3.45;
        //vou mostrar a conversão da moeda real para dolar
        System.out.println("Na carteira tinha " + real + " real. Feito a conversão, fica " + dolar + " dolar");
    }
}
