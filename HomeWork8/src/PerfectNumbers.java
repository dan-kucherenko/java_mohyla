import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        int bound = 10000;
        for (int num = 0; num < bound; num++) {
            int sum = 0;
            for (int div = 1; div <= num / 2; div++) {
                if (num % div == 0) sum = sum + div;
            }
            if (num == sum) {
                System.out.println(num);
            }
        }
    }
}