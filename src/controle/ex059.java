package controle;

import java.util.Scanner;

public class ex059 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, maiorIdade = Integer.MIN_VALUE, qtdHomens = 0, mulherMaisJovem = Integer.MAX_VALUE;
        String sexo, resposta;

        while (true) {
            System.out.print("Insira a idade: ");
            idade = in.nextInt();
            System.out.print("Insira o sexo (M - Masculino ou F - Feminino): ");
            sexo = in.next();
            System.out.println("==============================================");
            if (maiorIdade < idade) {
                maiorIdade = idade;
            }
            if (sexo.equalsIgnoreCase("M")) {
                qtdHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                if (mulherMaisJovem > idade) {
                    mulherMaisJovem = idade;
                }
            }
            System.out.print("Deseja continuar? (S - Sim ou N - Nao): ");
            resposta = in.next();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("===================================================");
        System.out.println("====================RESULTADO======================");
        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Quantidade de homens cadastrado: " + qtdHomens);
        System.out.println("Idade da mulher mais jovem: " + mulherMaisJovem);

    }
}
