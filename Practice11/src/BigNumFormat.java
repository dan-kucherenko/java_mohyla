
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BigNumFormat {
    private static int num;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        numFormatted(num);
    }
    private static void numFormatted(int number) {
        do {
            System.out.print("Введіть число для розділення: ");
            num = sc.nextInt();
            if (num != 0) {
                NumberFormat f = NumberFormat.getInstance(new Locale("us", "US"));
                System.out.println(f.format(num));
            } else System.out.println("Число дорівнює 0");
        } while (num != 0);

    }
}