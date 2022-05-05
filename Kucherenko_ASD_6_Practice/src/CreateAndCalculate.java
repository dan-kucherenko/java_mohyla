import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateAndCalculate {
    private double res;
    private ArrayList<int[]> arrayList = new ArrayList<>();
    private final int[] ARRAY_LENGTH = {1024, 2048, 4096, 8192, 16384, 32768};
    private final PrintWriter printWriter = TimeTester.printWriter;
    public Stopwatch sw = new Stopwatch();

    public interface CalculateTimeForAlgorithms {
        void calculateTime();
    }

    class TimeForBubbleSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Bubble sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.bubbleSort(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForSelectionSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Selection sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.selectionSort(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForInsertionSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Insertion sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.insertionSort(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForCombSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Comb sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.combSort(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class TimeForShellSorting implements CalculateTimeForAlgorithms {
        @Override
        public void calculateTime() {
            printWriter.print("Shell sort: ");
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.shellSort(arrayList.get(i));
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


    public void calculateTimeForAllAlgorithms() {
        TimeForBubbleSorting timeForBubbleSorting = new TimeForBubbleSorting();
        timeForBubbleSorting.calculateTime();
        TimeForSelectionSorting timeForSelectionSorting = new TimeForSelectionSorting();
        timeForSelectionSorting.calculateTime();
        TimeForInsertionSorting timeForInsertionSorting = new TimeForInsertionSorting();
        timeForInsertionSorting.calculateTime();
        TimeForCombSorting timeForCombSorting = new TimeForCombSorting();
        timeForCombSorting.calculateTime();
        TimeForShellSorting timeForShellSorting = new TimeForShellSorting();
        timeForShellSorting.calculateTime();
        TimeForMergeSorting timeForMergeSorting = new TimeForMergeSorting();
        timeForMergeSorting.calculateTime();
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
