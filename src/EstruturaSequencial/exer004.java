package EstruturaSequencial;

import java.util.Scanner;

public class exer004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senha;
        boolean stop = false;
        
        do { 
            System.out.print("Insira uma senha: ");
            senha = in.nextInt();
            if ( senha == 123) {
                stop = true;
                System.out.println("Acesso permitido!");
            }
        } while (!stop); 
    }
}
