package controle;

import java.util.Scanner;

public class ex057 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean stop = true;
        String sexo, resp;
        double salario, totSalHomem = 0, totSalMulher = 0;

        while (stop) {
            System.out.print("salário do funcionário: ");
            salario = in.nextDouble();
            System.out.print("sexo do funcionário (m - masculino ou f - femenino): ");
            sexo = in.next();
            if (sexo.equalsIgnoreCase("m")) {
                totSalHomem += salario;
            } else if (sexo.equalsIgnoreCase("f")) {
                totSalMulher += salario;
            }
            System.out.print("deseja continuar? (s - sim ou n - não): ");
            resp = in.next();
            if (resp.equalsIgnoreCase("n")) {
                stop = false;
            }
        }
        System.out.println("programa encerrado, obrigado");
        System.out.println("resultado: ");
        System.out.println("Total de salário para homens: " + totSalHomem);
        System.out.println("Total de salário para mulheres: " + totSalMulher);
    }
}
