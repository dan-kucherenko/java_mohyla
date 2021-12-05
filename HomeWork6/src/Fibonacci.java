import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть індекс:");
        int fibSize = sc.nextInt();
        for (int fibNum = 0; fibNum < fibSize; fibNum++) {
            System.out.println(fibNum + " - " + fibonacci(fibNum));
        }
    }

    public static int fibonacci(int fibNum) {
        if (fibNum == 0 || fibNum == 1) {
            return fibNum;
        } else {
            return fibonacci(fibNum - 1) + fibonacci(fibNum - 2);
        }


    }
}



