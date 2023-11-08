package lektion2;

import java.time.LocalTime;

public class UB3 {
    public static void main(String[] args) {
        int h = LocalTime.now().getHour();
        int m = LocalTime.now().getMinute();
        int s = LocalTime.now().getSecond();
        int a = h * 3600 + m * 60 + s;
        int b = 86400 - a;
        double c = (double) (a * 100) / 86400;

        System.out.println("Sek seit Mitternacht: " + a );
        System.out.println("Sek verbleibend: " + b );
        System.out.println("Prozent: " + c);


    }
}
