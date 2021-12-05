import java.util.Scanner;

public class Kucherenko_R13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть к-сть елементів(натуральне число): "); //запит на ввід даних
        int k = sc.nextInt();
        int res = 1;
        int x0 = 1;
        int x1 = 1;
        int xn;
        if (k == 0) System.out.println("Добуток К-елементів = 0");
        else {
            for (int i = 0; i < k-1; i++) {
                xn = x1 * (1 + x0);
                x0 = x1;
                x1 = xn;
                res *= xn;
            }
            System.out.println("Добуток К-елементів: " + res);

        }
    }
}
