package lektion1;

public class Tausch {
        public static void main(String[] args)
        {
            int x = 5;
            int y = 7;
            //Vor dem Tausch
            System.out.println(x);
            System.out.println(y);
            //Tausch
            int i = x;

            x = y;
            y = i;


            //Nach dem Tausch
            System.out.println(x);
            System.out.println(y);
        }
    }
