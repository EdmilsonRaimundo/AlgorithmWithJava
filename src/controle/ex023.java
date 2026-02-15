package controle;

import java.util.Scanner;

public class ex023 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, sexo;
        double valor, desconto;

        System.out.print("Entre com o nome: ");
        nome = in.next();
        System.out.print("Entre com o sexo (m - masculino / f - femenino): ");
        sexo = in.next();
        System.out.print("Entre com o valor da compra: ");
        valor = in.nextDouble();

        if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Desconto de 5% para Homens");
            desconto = valor - ((valor / 100) * 5);
            System.out.println("Valor da compra " + valor + " com desconto de 5% fica " + desconto);
        }
        
        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Desconto especial de 15% para Homens");
            desconto = valor - ((valor / 100) * 15);
            System.out.println("Valor da compra " + valor + " com desconto de 15% fica " + desconto);
        }
    }
}
