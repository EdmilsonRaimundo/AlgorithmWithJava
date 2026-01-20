package sequencial;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, antecessor, sucessor;
        
        System.out.print("Insira um número qualquer positivo: ");
        numero = in.nextInt();
        System.out.println("O antecessor de " + numero + " é " + (numero - 1));
        System.out.println("O sucessor de " + numero + " é " + (numero + 1));
        
    } 
}
