import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateAndCalculate {
    private double res;
    private ArrayList<int[]> arrayList = new ArrayList<>();
    private final int[] ARRAY_LENGTH = {1024, 2048, 4096, 8192, 16384, 32768};
    private final PrintWriter printWriter = TimeTester.printWriter;
    private Stopwatch sw = new Stopwatch();

    public interface CalculateTimeForAlgorithms {
        void calculateTime();
    }

    class TimeForMergeSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Merge sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.mergeSort(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForMergeSortingWithInsertion implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Merge sort with insertion sorting: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.mergeSortWithInsertion(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }


    class TimeForMergeSortingWithComparing implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Merge sort with comparing sorting: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.mergeSortWithComparing(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForMergeWithTwoModifications implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Merge sort with 2 modifications: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.mergeSortWithTwoModifications(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForQuickSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Quick sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.quickSortGeneral(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForQuickWithInsertionSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Quick sort with insertion sorting: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.quickSortGeneralWithInsertion(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForQuickWithDijkstraSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Quick sort with Dijkstra sorting: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.quickSortGeneralWithDijkstra(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForQuickWithTwoModifications implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Quick sort with 2 modifications: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.quickSortGeneralWithTwoModifications(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    public void calculateTimeForAllAlgorithms() {
        TimeForMergeSorting timeForMergeSorting = new TimeForMergeSorting();
        timeForMergeSorting.calculateTime();
        TimeForMergeSortingWithInsertion timeForMergeSortingWithInsertion = new TimeForMergeSortingWithInsertion();
        timeForMergeSortingWithInsertion.calculateTime();
        TimeForMergeSortingWithComparing timeForMergeSortingWithComparing = new TimeForMergeSortingWithComparing();
        timeForMergeSortingWithComparing.calculateTime();
        TimeForMergeWithTwoModifications timeForMergeWithTwoModifications = new TimeForMergeWithTwoModifications();
        timeForMergeWithTwoModifications.calculateTime();

        TimeForQuickSorting timeForQuickSorting = new TimeForQuickSorting();
        timeForQuickSorting.calculateTime();
        TimeForQuickWithInsertionSorting timeForQuickWithInsertionSorting = new TimeForQuickWithInsertionSorting();
        timeForQuickWithInsertionSorting.calculateTime();
        TimeForQuickWithDijkstraSorting timeForQuickWithDijkstraSorting = new TimeForQuickWithDijkstraSorting();
        timeForQuickWithDijkstraSorting.calculateTime();
        TimeForQuickWithTwoModifications timeForQuickWithTwoModifications = new TimeForQuickWithTwoModifications();
        timeForQuickWithTwoModifications.calculateTime();
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
