import acm.program.ConsoleProgram;

public class PythagoreanTheorem extends ConsoleProgram {
    public void run() {
        println("Enter a and b to compute Pythagorean theorem");
        print("a: ");
        int a = readInt(); //сканер для 1-го числа
        print("b: ");
        int b = readInt(); // сканер для 2-го числа
        println("Your numbers are: \n" + "a: " + a + "\nb: " + b);
        println("c = " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
