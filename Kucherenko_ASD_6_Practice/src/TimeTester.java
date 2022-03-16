import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TimeTester {

    private static int[] numbers = new int[1024];
    private static double res;
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

    private static void generateNewRandomArray(int[] numbers) {
        Random r = new Random(100);
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = r.nextInt();
            numbers[i] = randomNum;
        }
    }

    private static void calculateTimeForBubbleSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swBubble = new Stopwatch();
        Sorter.bubbleSort(numbers);
        res = swBubble.elapsedTime();
        printWriter.println("Час виконання алгоритму бульбашкового сортування: " + res);
    }

    private static void calculateTimeForSelectionSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swSelection = new Stopwatch();
        Sorter.selectionSort(numbers);
        res = swSelection.elapsedTime();
        printWriter.println("Час виконання алгоритму вибіркового сортування: " + res);
    }

    private static void calculateTimeForInsertionSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swInsertion = new Stopwatch();
        Sorter.insertionSort(numbers);
        res = swInsertion.elapsedTime();
        printWriter.println("Час виконання алгоритму вставного сортування: " + res);
    }

    private static void calculateTimeForCombSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swComb = new Stopwatch();
        Sorter.combSort(numbers);
        res = swComb.elapsedTime();
        printWriter.println("Час виконання алгоритму сортування гребінцем: " + res);
    }

    private static void calculateTimeForShellSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swShell = new Stopwatch();
        Sorter.shellSort(numbers);
        res = swShell.elapsedTime();
        printWriter.println("Час виконання алгоритму сортування Шелла: " + res);
    }

    private static void calculateTimeForQuickSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swQuick = new Stopwatch();
        Sorter.quickSort(numbers, 0, numbers.length - 1);
        res = swQuick.elapsedTime();
        printWriter.println("Час виконання алгоритму швидкого сортування: " + res);
    }

    private static void calculateTimeForMergeSorting() {
        generateNewRandomArray(numbers);
        Stopwatch swMerge = new Stopwatch();
        Sorter.mergeSort(numbers);
        res = swMerge.elapsedTime();
        printWriter.println("Час виконання алгоритму сортування злиттям: " + res);
    }

}
