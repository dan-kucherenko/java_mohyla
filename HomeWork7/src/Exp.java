import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Задайте х: ");
        double x = myScan.nextDouble();
        System.out.print("Задайте точність обчислювань: ");
        double eps = myScan.nextDouble();
        System.out.println("Чисельна експонента = " + expr(x, eps));
        System.out.println("Math    exp = "+Math.exp(x));
    }

    private static double expr(double x, double eps) {
        if (x == 0) {
            return 1;
        }
        double expression = 1;
        int k = 1;
        double x_next = x / k;
        while (x_next > eps) {
            expression += x_next; //expression = expression+ x_next;
            k++; //k=k+1
            x_next = x_next * x / k;
        }
        return expression;
    }
}
