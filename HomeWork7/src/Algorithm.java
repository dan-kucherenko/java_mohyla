import java.util.Scanner;

public class Algorithm {
    private static int actionsCounter;

    public static void main(String[] args) {
        System.out.println("Введіть число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("\nВведене число: "+num+"\n");
        divideByTwo(num);
        System.out.println("\nКількість виконаних кроків - " + actionsCounter);
    }

    public static void divideByTwo(int n) {
        if (n == 1) System.out.println("Число n=1");
        else {
            if (n % 2 == 0) {
                System.out.println("Число парне, " + n + "/2 = " + (n / 2));
                n = (n / 2);
            } else {
                System.out.println("Число непарне, " + n + "*3+1 = " + (n * 3 + 1));
                n = (n * 3 + 1);
            }
            actionsCounter++;
            divideByTwo(n);
        }
    }
}