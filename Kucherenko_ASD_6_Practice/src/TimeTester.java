import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TimeTester {
    private static double res;
    private static PrintWriter printWriter;
    private static ArrayList<int[]> arrayList = new ArrayList<>();


    private static int[] arrayLength = {1024, 2048, 4096, 8192, 16384, 32768};

    public static void main(String[] args) {
        try {
            printWriter = new PrintWriter(new FileWriter("timeTester.txt"));
            printWriter.println("Random array:");
            createRandomArrays();       //calculate algorithm time execution for arrays with random numbers
            calculateTimeForAllAlgorithms();

            printWriter.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    private static void calculateTimeForBubbleSorting() {
        printWriter.print("Bubble sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swBubble = new Stopwatch();
            Sorter.bubbleSort(arrayList.get(i));
            res = swBubble.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void calculateTimeForSelectionSorting() {
        printWriter.print("Selection sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swSelection = new Stopwatch();
            Sorter.selectionSort(arrayList.get(i));
            res = swSelection.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void calculateTimeForInsertionSorting() {
        printWriter.print("Insertion sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swInsertion = new Stopwatch();
            Sorter.insertionSort(arrayList.get(i));
            res = swInsertion.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void calculateTimeForCombSorting() {
        printWriter.print("Comb sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swComb = new Stopwatch();
            Sorter.combSort(arrayList.get(i));
            res = swComb.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void calculateTimeForShellSorting() {
        printWriter.print("Shell sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swShell = new Stopwatch();
            Sorter.shellSort(arrayList.get(i));
            res = swShell.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void calculateTimeForQuickSorting() {
        printWriter.print("Quick sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swQuick = new Stopwatch();
            Sorter.quickSortGeneral(arrayList.get(i));
            res = swQuick.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void calculateTimeForMergeSorting() {
        printWriter.print("Merge sort: ");
        for (int i = 0; i < arrayLength.length; i++) {
            Stopwatch swMerge = new Stopwatch();
            Sorter.mergeSort(arrayList.get(i));
            res = swMerge.elapsedTime();
            printWriter.print("{" + arrayLength[i] + "=" + res + "} ");
        }
    }

    private static void createRandomArrays() {
        for (int i = 0; i < arrayLength.length; i++)
            arrayList.add(GenerateAnArray.generateNewRandomArray(arrayLength[i]));
    }

    private static void calculateTimeForAllAlgorithms() {
        calculateTimeForBubbleSorting();
        calculateTimeForSelectionSorting();
        calculateTimeForInsertionSorting();
        calculateTimeForCombSorting();
        calculateTimeForShellSorting();
        calculateTimeForQuickSorting();
        calculateTimeForMergeSorting();
    }

}
