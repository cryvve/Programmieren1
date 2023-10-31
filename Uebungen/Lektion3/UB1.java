package Lektion3;

import java.util.Scanner;

public class UB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 7 == 0)
            System.out.println("Die Zahl ist durch 7 teilbar");
        else
            System.out.println("Die Zahl ist nicht durch 7 teilbar");
    }
}
