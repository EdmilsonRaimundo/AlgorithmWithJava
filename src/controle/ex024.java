package controle;

import java.util.Scanner;

public class ex024 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double km, distancia, totalPagar;

        // entrada de dados
        System.out.print("Quantos km vai percorrer na sua viagem: ");
        distancia = in.nextDouble();
        // fazendo a verificação do quanto deve pagar pela passagem e exibir o total
        if (distancia <= 200) {
            km = 0.50;
            totalPagar = (distancia * km);
            System.out.println("A viagem será a menos de 200km, vai pagar " + totalPagar);
        } else if (distancia > 200) {
            km = 0.40;
            totalPagar = (distancia * km);
            System.out.println("A viagem será a mais de 200km, vai pagar " + totalPagar);
        } else {
            System.out.println("ERRO!!!");
        }
    }
}
