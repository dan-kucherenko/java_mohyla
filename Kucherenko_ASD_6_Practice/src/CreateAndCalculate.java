import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateAndCalculate {
    private double res;
    private ArrayList<int[]> arrayList = new ArrayList<>();
    private final int[] ARRAY_LENGTH = {1024, 2048, 4096, 8192, 16384, 32768};
    private final PrintWriter printWriter = TimeTester.printWriter;
    private Stopwatch sw;

    class CalculateTime {
        public void calculateTime() {
            sw = new Stopwatch();
            for (int i = 0; i < ARRAY_LENGTH.length; i++) {
                sw.startTime();
                Sorter.bubbleSort(arrayList.get(i));
                res = sw.elapsedTime();
                printWriter.print("{" + ARRAY_LENGTH[i] + "=" + res + "} ");
            }
            printWriter.print('\n');
        }
    }

    class CalculateTimeForBubbleSorting extends CalculateTime {
        public void calculateTimeForBubbleSorting() {
            printWriter.print("Bubble sort: ");
            calculateTime();
        }
    }

    class CalculateTimeForSelectionSorting extends CalculateTime {
        public void calculateTimeForSelectionSorting() {
            printWriter.print("Selection sort: ");
            calculateTime();
        }
    }

    class CalculateTimeForInsertionSorting extends CalculateTime {
        public void calculateTimeForInsertionSorting() {
            printWriter.print("Insertion sort: ");
            calculateTime();
        }
    }

    class CalculateTimeForCombSorting extends CalculateTime {
        public void calculateTimeForCombSorting() {
            printWriter.print("Comb sort: ");
            calculateTime();
        }
    }

    class CalculateTimeForShellSorting extends CalculateTime {
        public void calculateTimeForShellSorting() {
            printWriter.print("Shell sort: ");
            calculateTime();
        }
    }

    class CalculateTimeForQuickSorting extends CalculateTime {
        public void calculateTimeForQuickSorting() {
            printWriter.print("Quick sort: ");
            calculateTime();
        }
    }

    class CalculateTimeForMergeSortin extends CalculateTime {
        public void calculateTimeForMergeSorting() {
            printWriter.print("Merge sort: ");
            calculateTime();
        }
    }

    public void calculateTimeForAllAlgorithms() {
        CalculateTimeForBubbleSorting calcBubble = new CalculateTimeForBubbleSorting();
        calcBubble.calculateTimeForBubbleSorting();
        CalculateTimeForSelectionSorting calcSelect = new CalculateTimeForSelectionSorting();
        calcSelect.calculateTimeForSelectionSorting();
        CalculateTimeForInsertionSorting calcInsertion = new CalculateTimeForInsertionSorting();
        calcInsertion.calculateTimeForInsertionSorting();
        CalculateTimeForCombSorting calcComb = new CalculateTimeForCombSorting();
        calcComb.calculateTimeForCombSorting();
        CalculateTimeForShellSorting calcShell = new CalculateTimeForShellSorting();
        calcShell.calculateTimeForShellSorting();
        CalculateTimeForQuickSorting calcQuick = new CalculateTimeForQuickSorting();
        calcQuick.calculateTimeForQuickSorting();
        CalculateTimeForMergeSortin calcMerge = new CalculateTimeForMergeSortin();
        calcMerge.calculateTimeForMergeSorting();
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
