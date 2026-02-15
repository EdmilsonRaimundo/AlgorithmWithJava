package controle;

import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numero, km, hm, dam, dm, cm, mm;

        System.out.print("Entre com um numero positivo em metros: ");
        numero = in.nextDouble();
        km = numero / 1000;
        hm = numero / 100;
        dam = numero / 10;
        dm = numero * 1000;
        cm = numero * 100;
        mm = numero * 10;
        System.out.println("km = " + km);
        System.out.println("hm = " + hm);
        System.out.println("dam = " + dam);
        System.out.println("dm = " + dm);
        System.out.println("cm = " + cm);
        System.out.println("mm = " + mm);
    }
}
