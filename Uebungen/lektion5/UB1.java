package lektion5;

public class UB1 {
    public static void main(String[] args) {
        int k = 1;
        double sum = 0;
        double prevSum;
        double diff;

        do {
            prevSum = sum;
            sum += 1.0 / (k * k);
            diff = sum - prevSum;
            if (diff < 0) {
                diff = -diff;
            }
            k++;
            System.out.println(6*sum);
        } while (diff >= 1e-5);
    }
}
