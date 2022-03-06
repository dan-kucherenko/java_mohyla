import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TimeTester {

    private static int[] numbers = new int[8192];
    private static double res;

    public static void main(String[] args) throws IOException {
        Stopwatch sw = new Stopwatch();
        Sorter s = new Sorter();
        PrintWriter printWriter = new PrintWriter(new FileWriter("timeTester.txt"));
        calculateTimeForBubbleSorting(sw, s, printWriter);
        calculateTimeForSelectionSorting(sw, s, printWriter);
        calculateTimeForInsertionSorting(sw, s, printWriter);
        calculateTimeForCombSorting(sw, s, printWriter);


        printWriter.close();
    }

    private static void generateNewArray(int[] numbers) {
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = r.nextInt();
            numbers[i] = randomNum;
        }
    }

    private static void calculateTimeForBubbleSorting(Stopwatch sw, Sorter s, PrintWriter printWriter) {
        generateNewArray(numbers);
        s.bubbleSort(numbers);
        res = sw.elapsedTime();
        printWriter.println("Час виконання  алгоритму бульбашкового сортування: " + res);
    }

    private static void calculateTimeForSelectionSorting(Stopwatch sw, Sorter s, PrintWriter printWriter) {
        generateNewArray(numbers);
        s.selectionSort(numbers);
        res = sw.elapsedTime();
        printWriter.println("Час виконання  алгоритму бульбашкового сортування: " + res);
    }

    private static void calculateTimeForInsertionSorting(Stopwatch sw, Sorter s, PrintWriter printWriter) {
        generateNewArray(numbers);
        s.insertionSort(numbers);
        res = sw.elapsedTime();
        printWriter.println("Час виконання  алгоритму бульбашкового сортування: " + res);
    }

    private static void calculateTimeForCombSorting(Stopwatch sw, Sorter s, PrintWriter printWriter) {
        generateNewArray(numbers);
        s.combSort(numbers);
        res = sw.elapsedTime();
        printWriter.println("Час виконання  алгоритму бульбашкового сортування: " + res);
    }
}
