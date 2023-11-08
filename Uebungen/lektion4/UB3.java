package lektion4;

import java.util.Scanner;

public class UB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte zu untersuchende Zahl eingeben: ");
        int num = sc.nextInt();



        for (int ii = 1; ii <= num; ii++) {
            boolean istPrim = true;

            if (ii <= 1) {
                istPrim = false;
            } else {
                for (int i = 2; i <= Math.sqrt(ii); i++) {
                    if (ii % i == 0) {
                        istPrim = false;
                        break;
                    }
                }
            }
            if (istPrim)
                System.out.println(ii + " ist eine Primzahl");
            else
                System.out.println(ii +" ist keine Primzahl");
        }
        sc.close();
    }
}
