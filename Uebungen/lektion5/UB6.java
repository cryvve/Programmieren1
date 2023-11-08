package lektion5;
import java.util.Scanner;
public class UB6 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ihre Eingaben werden addiert.");
        System.out.println("Die Eingabe von 0 beendet das Programm und gibt die Summe aus.");

        while(true) {
            num = sc.nextInt();
            if (num == 0) {
                System.out.println(sum);
                break;
            } else
                sum += num;


        }
    }
}
