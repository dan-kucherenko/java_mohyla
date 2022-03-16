import java.util.Random;

public class GenerateAnArray {
    public static int[] generateNewRandomArray(int arrayLength) {
        int[] randomArrayOfInt = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++)
            randomArrayOfInt[i] = r.nextInt();
        return randomArrayOfInt;
    }

    public static int[] generateSortedArray(int arrayLength) {
        int[] sortedArray = generateNewRandomArray(arrayLength);
        Sorter.mergeSort(sortedArray);
        return sortedArray;
    }

    public static int[] generateReverseSortedArray(int arrayLength) {
        int[] reverseSortedArray = generateNewRandomArray(arrayLength);
        Sorter.mergeSort(reverseSortedArray);
        for (int i = arrayLength - 1; i >= 0; i--)
            reverseSortedArray[arrayLength - i - 1] = reverseSortedArray[i];
        return reverseSortedArray;
    }

    public static int[] generateNewArrayWithSameElement(int arrayLength) {
        int[] arrayWithSameElement = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            arrayWithSameElement[i] = 1000;
        return arrayWithSameElement;
    }
}
