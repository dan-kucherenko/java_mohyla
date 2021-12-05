import java.util.Scanner;

public class EuclidSAlgorithm {
    private static int a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число a: ");
        a = sc.nextInt();
        System.out.print("Введіть число b: ");
        b = sc.nextInt();
        eugAlg();
    }

    private static void eugAlg() {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        System.out.println("НСД = " + a);
    }
}
