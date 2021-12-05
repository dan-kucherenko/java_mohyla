import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Ігрок 1 загадав своє число");
        System.out.print("Введіть число: ");
        random();
        System.out.println("Кількість спроб: " + counter);
    }

    private static void random() {
        boolean ifGuessed = true;
        Random randNum = new Random();
        Scanner sc = new Scanner(System.in);
        int x = randNum.nextInt(99) + 1;
        while (ifGuessed) {
            int num = sc.nextInt();
            if (num > x) {
                System.out.println("Менше!");
            }
            if (num < x) {
                System.out.println("Більше!");
            }
            if (num == x) {
                System.out.println("Правильно!");
                ifGuessed = !ifGuessed;
            }
            counter++;
        }
    }
}

