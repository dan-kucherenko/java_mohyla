import java.util.Comparator;
import java.util.Random;

public class Sorter {
    public static Comparable[] quickSort(Comparable[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return arr;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        Comparable pivot = arr[pivotIndex];
        Comparable temp3 = arr[pivotIndex];
        arr[pivotIndex] = arr[highIndex];
        arr[highIndex] = temp3;

        int leftPointer = lowIndex, rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer].compareTo(pivot) <= 0 && leftPointer < rightPointer)
                leftPointer++;
            while (arr[rightPointer].compareTo(pivot) >= 0 && rightPointer > leftPointer)
                rightPointer--;
            Comparable temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;
        }
        Comparable temp2 = arr[leftPointer];
        arr[leftPointer] = arr[highIndex];
        arr[highIndex] = temp2;

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
        return arr;
    }
    public static Object[] quickSortComparator(Comparator c, Object[]objects, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return objects;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        Object pivot = objects[pivotIndex];
        Object temp3 = objects[pivotIndex];
        objects[pivotIndex] = objects[highIndex];
        objects[highIndex] = temp3;

        int leftPointer = lowIndex, rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (c.compare(objects[leftPointer], pivot) <= 0 && leftPointer < rightPointer)
                leftPointer++;
            while (c.compare(objects[rightPointer], pivot) >= 0 && rightPointer > leftPointer)
                rightPointer--;
            Object temp = objects[leftPointer];
            objects[leftPointer] = objects[rightPointer];
            objects[rightPointer] = temp;
        }
        Object temp2 = objects[leftPointer];
        objects[leftPointer] = objects[highIndex];
        objects[highIndex] = temp2;

        quickSortComparator(c, objects, lowIndex, leftPointer - 1);
        quickSortComparator(c, objects, leftPointer + 1, highIndex);
        return objects;
    }
}