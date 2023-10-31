package Lektion3;

import java.util.Scanner;

public class UB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = (int) sc.next().charAt(0);

        if (c > 65 && c < 91)
            System.out.println("Großbuchstabe");
        else if ((c > 47 && c < 58) || (c > 96 && c < 123))
            System.out.println("Hexadezimale Ziffer");
   //...

    }
}
