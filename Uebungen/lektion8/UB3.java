package lektion8;

import java.util.Objects;

public class UB3 {
    public static void main(String[] args) {
        int solution = 0;

        if (Objects.equals(args[args.length - 1], "-")) {
            for (int i = 1; i < args.length - 1; i++) {
                solution = Integer.parseInt(args[i]) + solution;
            }
            System.out.println(Integer.parseInt(args[0]) - solution);
        }

        if (Objects.equals(args[args.length - 1], "+")) {
            for (int i = 0; i < args.length - 1; i++) {
                solution = Integer.parseInt(args[i]) + solution;
            }
            System.out.println(solution);
        }
    }
}
