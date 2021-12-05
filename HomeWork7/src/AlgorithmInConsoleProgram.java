import acm.program.ConsoleProgram;

public class AlgorithmInConsoleProgram extends ConsoleProgram {
    private static int actionsCounter;

    public void run() {
        println("Введіть число: ");
        int num = readInt();
        println("\nВведене число: " + num + "\n");
        divideByTwo(num);
        println("Кількість виконаних кроків - " + actionsCounter);
    }

    public void divideByTwo(int n) {
        if (n == 1) println("Число n=1");
        else {
            if (n % 2 == 0) {
                println("Число парне, " + n + "/2 = " + (n / 2));
                n = (n / 2);
            } else {
                println("Число непарне, " + n + "*3+1 = " + (n * 3 + 1));
                n = (n * 3 + 1);
            }
            actionsCounter++;
            divideByTwo(n);
        }
    }
}