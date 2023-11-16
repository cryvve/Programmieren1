package lektion6;

public class UB7 {
    public static int potenz(int x, int n) {
        if (n == 0) return 1;
        else return x * potenz(x, n-1);
    }


    public static void main(String[] args) {
        System.out.println(potenz(187,4 ));
    }
}
