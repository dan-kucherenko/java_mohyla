import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a programming language: ");
        Scanner sc = new Scanner(System.in);
        String prLang = sc.nextLine();
        if (prLang.equals("Java")) {
            System.out.println("This is programming language Java");
        } else if (prLang.equals("C#")) {
            System.out.println("This is programming language C#");
        } else if (prLang.equals("C++")) {
            System.out.println("This is programming language C++");
        } else {
            System.out.println("Incorrect name!");
        }
    }
}
