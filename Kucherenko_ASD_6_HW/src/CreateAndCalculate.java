import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateAndCalculate {
    private double res;
    private ArrayList<int[]> arrayList = new ArrayList<>();
    private final int[] ARRAY_LENGTH = {1024, 2048, 4096, 8192, 16384, 32768};
    private final PrintWriter printWriter = TimeTester.printWriter;
    private Stopwatch sw = new Stopwatch();

    private void calculateTimeForMergeSorting() {
        printWriter.print("Merge sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.mergeSort(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTimeForMergeWithInsertionSorting() {
        printWriter.print("Merge sort with insertion sorting: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.mergeSortWithInsertion(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTimeForMergeWithComparingSorting() {
        printWriter.print("Merge sort with comparing sorting: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.mergeSortWithComparing(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTimeForMergeWithTwoModifications() {
        printWriter.print("Merge sort with 2 modifications: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.mergeSortWithTwoModifications(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTimeForQuickSorting() {
        printWriter.print("Quick sort: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.quickSortGeneral(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTimeForQuickWithInsertionSorting() {
        printWriter.print("Quick sort with insertion sorting: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.quickSortGeneralWithInsertion(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTimeForQuickWithDijkstraSorting() {
        printWriter.print("Quick sort with Dijkstra sorting: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.quickSortGeneralWithDijkstra(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    private void calculateTImeForQuickWithTwoModifications() {
        printWriter.print("Quick sort with 2 modifications: ");
        for (int i = 0; i < ARRAY_LENGTH.length; i++) {
            sw.startTime();
            Sorter.quickSortGeneralWithTwoModifications(arrayList.get(i));
            res = sw.elapsedTime();
            printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
        }
        printWriter.print('\n');
    }

    public void calculateTimeForAllAlgorithms() {
        calculateTimeForMergeSorting();
        calculateTimeForMergeWithInsertionSorting();
        calculateTimeForMergeWithComparingSorting();
        calculateTimeForMergeWithTwoModifications();
        calculateTimeForQuickSorting();
        calculateTimeForQuickWithInsertionSorting();
        calculateTimeForQuickWithDijkstraSorting();
        calculateTImeForQuickWithTwoModifications();
    }

    protected void createRandomArrays() {
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateNewRandomArray(j));
    }

    protected void createSortedArrays() {
        arrayList.clear();
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateSortedArray(j));
    }

    protected void createReverseSortedArray() {
        arrayList.clear();
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateReverseSortedArray(j));
    }

    protected void createArraysWithSameElement() {
        arrayList.clear();
        for (int j : ARRAY_LENGTH) arrayList.add(GenerateAnArray.generateNewArrayWithSameElement(j));
    }
}
