package Lektion3;

import java.util.Scanner;

public class UB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pizza groesse 1:");
        int pizzaGroesse1 = sc.nextInt();
        System.out.println("Pizza groesse 2");
        int pizzaGroesse2 = sc.nextInt();
        System.out.println("Pizza preis 1");
        double pizzaPreis1 = sc.nextDouble();
        System.out.println("Pizza preis 2");
        double pizzaPreis2 = sc.nextDouble();

        double verhaeltnis1 = pizzaGroesse1/pizzaPreis1;
        double verhaeltnis2 = pizzaGroesse2/pizzaPreis2;

        if (verhaeltnis1 > verhaeltnis2)
            System.out.println("Die erste Pizza hat ein besseres Groessen-/Preisverhaeltnis");
        else
            System.out.println("Die zweite Pizza hat ein besseres Groessen-/Preisverhaeltnis");

    }
}
