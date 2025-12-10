package EstruturaControle;

import java.util.Scanner;

public class exer002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        
        System.out.println("====== confirir a idade =====");
        System.out.print("Insira a sua idade: ");
        idade = in.nextInt();
        
        if (idade <= 18) { 
            System.out.println("Não, pode votar.");
        } else {
            System.out.println("Sim, poode votar.");
        }
    }  
}
