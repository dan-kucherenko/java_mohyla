import java.util.Scanner;

public class Kucherenko_K45 {
    private static int n;
    private static int counter;
    private static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть натуральне число n: ");
        n = sc.nextInt();
        popNum(n);
    }

    public static void popNum(int n) {
        res = 0;
        System.out.println("Число n = " + n);
        System.out.println("Цифра " + res + " зустрічаєтся найбільше");
        System.out.println("К-сть входжень: " + counter);
    }
}
