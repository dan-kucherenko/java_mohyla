import java.io.*;
import java.util.Random;

public class GenerateAnArray {
    public static void generateSortedArray(int arrayLength) {
        int[] sortedArray = generateNewRandomIntArray(arrayLength);
        Sorter.mergeSort(sortedArray);
    }

    public static void generateNewArrayWithSameElement(int arrayLength) throws IOException {
        int[] arrayWithSameElement = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            arrayWithSameElement[i] = 1000;
    }

    public static void generateReverseSortedArray(int arrayLength) throws IOException {
        int[] reverseSortedArray = generateNewRandomIntArray(arrayLength);
        Sorter.mergeSort(reverseSortedArray);
        for (int i = arrayLength - 1; i >= 0; i--)
            reverseSortedArray[arrayLength - i] = reverseSortedArray[i];
    }

    public static int[] generateNewRandomIntArray(int arrayLength) {
        int[] randomArrayOfInt = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++)
            randomArrayOfInt[i] = r.nextInt();
        return randomArrayOfInt;
    }
}
