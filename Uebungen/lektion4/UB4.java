package lektion4;

import java.util.Scanner;

public class UB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gueltig = false;

        while (!gueltig) {
            System.out.println("Geben Sie bitte eine Zahl ein:");
            int num = sc.nextInt();
            int res = num;
            if (num >= 1 && num <= 1000000) {
                int product = 1;
                while (num != 0) {
                    product *= num % 10;
                    num /= 10;
                }
                System.out.println("Das Querprodukt der Zahl " + res + " betraegt " + product);
                break;
            } else
                System.out.println("FEHLER - Zahl ist ungueltig.");
        }
        sc.close();
    }
}
