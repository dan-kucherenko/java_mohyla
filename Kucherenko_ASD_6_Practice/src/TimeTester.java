import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TimeTester {

    private static int[] numbers = new int[2048];
    private static double res;
    private static Sorter s = new Sorter();
    private static PrintWriter printWriter;

    static {
        try {
            printWriter = new PrintWriter(new FileWriter("timeTester.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        calculateTimeForBubbleSorting();
        calculateTimeForSelectionSorting();
        calculateTimeForInsertionSorting();
        calculateTimeForCombSorting();
        calculateTimeForShellSorting();
        calculateTimeForQuickSorting();
        calculateTimeForMergeSorting();
        printWriter.close();
    }

    private static void generateNewArray(int[] numbers) {
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = r.nextInt();
            numbers[i] = randomNum;
        }
    }

    private static void calculateTimeForBubbleSorting() {
        generateNewArray(numbers);
        Stopwatch swBubble = new Stopwatch();
        s.bubbleSort(numbers);
        res = swBubble.elapsedTime();
        printWriter.println("Час виконання алгоритму бульбашкового сортування: " + res);
    }

    private static void calculateTimeForSelectionSorting() {
        generateNewArray(numbers);
        Stopwatch swSelection = new Stopwatch();
        s.selectionSort(numbers);
        res = swSelection.elapsedTime();
        printWriter.println("Час виконання алгоритму вибіркового сортування: " + res);
    }

    private static void calculateTimeForInsertionSorting() {
        generateNewArray(numbers);
        Stopwatch swInsertion = new Stopwatch();
        s.insertionSort(numbers);
        res = swInsertion.elapsedTime();
        printWriter.println("Час виконання алгоритму вставного сортування: " + res);
    }

    private static void calculateTimeForCombSorting() {
        generateNewArray(numbers);
        Stopwatch swComb = new Stopwatch();
        s.combSort(numbers);
        res = swComb.elapsedTime();
        printWriter.println("Час виконання алгоритму сортування гребінцем: " + res);
    }

    private static void calculateTimeForShellSorting() {
        generateNewArray(numbers);
        Stopwatch swComb = new Stopwatch();
        s.shellSort(numbers);
        res = swComb.elapsedTime();
        printWriter.println("Час виконання алгоритму сортування Шелла: " + res);
    }

    private static void calculateTimeForQuickSorting() {
        generateNewArray(numbers);
        Stopwatch swComb = new Stopwatch();
        s.quickSort(numbers, 0, numbers.length - 1);
        res = swComb.elapsedTime();
        printWriter.println("Час виконання алгоритму швидкого сортування: " + res);
    }

    private static void calculateTimeForMergeSorting() {
        generateNewArray(numbers);
        Stopwatch swComb = new Stopwatch();
        s.mergeSort(numbers);
        res = swComb.elapsedTime();
        printWriter.println("Час виконання алгоритму сортування злиттям: " + res);
    }

}
