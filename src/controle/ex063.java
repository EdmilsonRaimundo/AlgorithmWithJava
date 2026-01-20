package controle;

import java.util.Scanner;

public class ex063 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, menor = Integer.MAX_VALUE, somaNumeros = 0, qtdNumeros = 0, qtdPares = 0;
        double mdValores;
        String opcao;

        int i = 0;
        do {
            System.out.print("Insira um numero qualquer: ");
            numero = in.nextInt();
            qtdNumeros++;
            somaNumeros += numero;
            if (numero < menor) { 
                menor = numero;
            }
            if (numero % 2 == 0) { 
                qtdPares++;
            }
            System.out.print("Deseja encerrar o programa? (s - sim ou n - nao) = ");
            opcao = in.next();
            if (opcao.equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
        mdValores = qtdNumeros / somaNumeros;
        System.out.println("Menor valor: " + menor); 
        System.out.println("Soma de todos os valores: " + somaNumeros);
        System.out.println("Media dos valores: " + mdValores);
    }
}
