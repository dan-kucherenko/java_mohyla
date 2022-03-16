import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateAndCalculate {
    private double res;
    private ArrayList<int[]> arrayList = new ArrayList<>();
    private final int[] ARRAY_LENGTH = {1024, 2048, 4096, 8192, 16384, 32768};
    private final PrintWriter printWriter = TimeTester.printWriter;

    public void calculateTimeForBubbleSorting() {
        printWriter.print("Bubble sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swBubble = new Stopwatch();
            Sorter.bubbleSort(arrayList.get(i));
            res = swBubble.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForSelectionSorting() {
        printWriter.print("Selection sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swSelection = new Stopwatch();
            Sorter.selectionSort(arrayList.get(i));
            res = swSelection.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForInsertionSorting() {
        printWriter.print("Insertion sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swInsertion = new Stopwatch();
            Sorter.insertionSort(arrayList.get(i));
            res = swInsertion.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForCombSorting() {
        printWriter.print("Comb sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swComb = new Stopwatch();
            Sorter.combSort(arrayList.get(i));
            res = swComb.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForShellSorting() {
        printWriter.print("Shell sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swShell = new Stopwatch();
            Sorter.shellSort(arrayList.get(i));
            res = swShell.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForQuickSorting() {
        printWriter.print("Quick sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swQuick = new Stopwatch();
            Sorter.quickSortGeneral(arrayList.get(i));
            res = swQuick.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForMergeSorting() {
        printWriter.print("Merge sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            Stopwatch swMerge = new Stopwatch();
            Sorter.mergeSort(arrayList.get(i));
            res = swMerge.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForAllAlgorithms() {
        calculateTimeForBubbleSorting();
        calculateTimeForSelectionSorting();
        calculateTimeForInsertionSorting();
        calculateTimeForCombSorting();
        calculateTimeForShellSorting();
        calculateTimeForQuickSorting();
        calculateTimeForMergeSorting();
    }

    public void createRandomArrays() {
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateNewRandomArray(j));
    }

    public void createSortedArrays() {
        arrayList.clear();
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateSortedArray(j));
    }

    public void createReverseSortedArray() {
        arrayList.clear();
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateReverseSortedArray(j));
    }

    public void createArraysWithSameElement() {
        arrayList.clear();
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateNewArrayWithSameElement(j));
    }
}
