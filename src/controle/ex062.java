package controle;

import java.util.Scanner;

public class ex062 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, qtdIdade = 0, somaIdade = 0, qtdPares = 0;
        double mdIdades;
        boolean stop = false;
        String resp;

        int i = 0;
        do {
            System.out.print("Insira a idade = ");
            idade = in.nextInt();
            qtdIdade++;
            somaIdade += idade;
            if (idade % 2 == 0) {
                qtdPares++;
            }
            System.out.print("Deseja Encerrar o programa? (S - sim ou N - nao): ");
            resp = in.next();
            if (resp.equalsIgnoreCase("S")) {
                stop = true;
            }
        } while (!stop);
        mdIdades = somaIdade / qtdIdade;
        System.out.println("Resultados");
        System.out.println("Quantidade de idades: " + qtdIdade);
        System.out.println("Media de idades: " + mdIdades);
        System.out.println("Quantidade de pares: " + qtdPares);
    }
}
