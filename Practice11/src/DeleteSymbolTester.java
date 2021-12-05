import java.util.Scanner;

public class DeleteSymbolTester extends DeleteSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть строку для редагування: ");
        String str = sc.nextLine();
        System.out.print("Введіть фрагмент для заміни: ");
        String orig = sc.nextLine();
        System.out.print("Введіть фрагмент на який замінити: ");
        String repl = sc.nextLine();
        str = removeAllOccurences(str, orig, repl);
        System.out.println(str);
    }
}
