import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Your number is: " + num);
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even");
        } else {
            System.out.println("Number " + num + " is odd");
        }
    }
}
