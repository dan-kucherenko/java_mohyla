import java.util.Random;
import java.util.Scanner;

public class ClassLibrary {
    public void nameSurname(String name, String surname) {
        System.out.println("Метод №1");
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + surname);
        }
        System.out.println("\n");
    }

    public void sq() {
        System.out.println("Метод №2");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i + " - " + Math.pow(i, 2));
        }
        System.out.println("\n");

    }

    public void generalSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Метод №3");
        System.out.print("Введіть к-сть n цілих додатніх чисел: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum + "\n");
    }

    public void oddSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Метод №4");
        System.out.print("Введіть к-сть n непарних чисел: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i ++) {
            sum += i + 1;
        }
        System.out.println(sum + "\n");
    }

    public void realSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Метод №5");
        System.out.print("Введіть к-сть чисел n: ");
        int n = sc.nextInt();
        double sum = 1;
        for (int i = 1; i < n; i++) {
            sum += sum / i;
        }
        System.out.println(sum + "\n");
    }

    public void pow() {
        System.out.println("Метод №6");
        for (int i = 0; i <= 10; i++) {
            System.out.println(2 + " - " + Math.pow(2, i));
        }
    }

    public void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Метод №7");
        System.out.println("Введіть число n для обчислення його факторіалу: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        System.out.println("Факторіал числа " + n + " дорівнює " + fact);
    }

    public void function() {
        System.out.println("Метод №8");
        for (double x = -2; x <= 2; x += 0.25) {
            double y = -2.4 * x * x + 5 * x - 3;
            System.out.println("Функція при аргументі " + x + " дорівнює " + y);
        }
    }

    public void random() {
        System.out.println("Метод №9");
        Random rand = new Random();
        int[] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(10) + 1;
            sum += numbers[i];
        }
        System.out.println("Сума випадкових чисел = " + sum);
    }

    public void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Метод №10");
        System.out.print("Введіть число для перевірки: ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Число просте");
            }
        }
        System.out.println("Число складне");
    }
}