import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        byte num = sc.nextByte();
        System.out.println("Your grade is "+num);
        if (91 <= num && num <= 100) {
            System.out.println("Excellent");
        } else if (81 <= num && num <= 90) {
            System.out.println("Very good");
        } else if (71 <= num && num <= 80) {
            System.out.println("Good");
        } else if (66 <= num && num <= 70) {
            System.out.println("Satisfactory");
        } else if (60 <= num && num <= 65) {
            System.out.println("Weakly");
        } else if (30 <= num && num <= 59) {
            System.out.println("Bad");
        } else if (0 <= num && num <= 29) {
            System.out.println("Very bad");
        }

    }
}
