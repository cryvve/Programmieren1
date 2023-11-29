package lektion8;

import java.util.Scanner;

public class UB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = "PROGRAMMIERSPRACHE";
        char[] words = word.toCharArray();

        char[] solution = new char[words.length];

        for (int i = 0; i < words.length; i++) {
            solution[i] = ((char) 95);

        }

        for (int i = 0; i < 15; i++) {
            System.out.println("Gebe eine Buchstabe ein: ");
            String scan = sc.nextLine();
            scan = scan.toUpperCase();
            char[] c = scan.toCharArray();


            for (int j = 0; j < words.length; j++) {
                if (words[j] == c[0]) {
                    solution[j] = c[0];
                }
            }
            System.out.println(solution);

            if (words == solution) {
                System.out.println("Du hast gewonnen");
                break;
            }

        }
        System.out.println("Du hast verloren, das Wort war: " + word);
        sc.close();

    }
}
