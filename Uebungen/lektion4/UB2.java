package lektion4;

import java.util.Scanner;

public class UB2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Falldauer in Sekunden eingeben:");
        int t = sc.nextInt();
        double st;
        for (int i = 1; i <= t; i++) {
            st = ((double) 1/2) * 9.80665 * (i*i);
            if ((i-1)%5 == 0)
                System.out.println("Zeit: " + (i) + " Sekunden, Zurückgelegte Strecke: " + st + " m");
            Thread.sleep(1000);

        }
        sc.close();
    }
}
