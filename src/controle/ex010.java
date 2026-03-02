package controle;

import java.util.Scanner;

public class ex010 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura, largura, area, qtdTinta;
        int litroTinta = 2;

        // entrada de dados
        System.out.println("Insira o valor de largura?");
        largura = in.nextDouble();
        System.out.println("Insira o valor de altura?");
        altura = in.nextDouble();
        // calculando a area 
        area = largura * altura;
        // calculando a quantidade de tinta necessaria
        qtdTinta = area / litroTinta;
        // exibir a area de uma parede
        System.out.println("A área de uma parede é de " + area + "m²");
        // exibir a quantidade de tinta que vai se gastar para pintar uma area ou parede
        System.out.println("A quantidade de tinta que vai se precisar para pintar a area " + area + "m² é de " + qtdTinta + "lt.");

    }
}
