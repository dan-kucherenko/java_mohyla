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

    public static Object[] quickSortComparator(Comparator c, Object[] objects, int lowIndex, int highIndex) {
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

    public static Comparable[] mergeSort(Comparable[] arr) {
        int length = arr.length;
        if (length < 2)
            return arr;
        int midIndex = length / 2;
        Comparable[] leftHalfArray = new Comparable[midIndex];          //split the array to 2
        Comparable[] rightHalfArray = new Comparable[length - midIndex];
        for (int i = 0; i < midIndex; i++)
            leftHalfArray[i] = arr[i];  //write each array
        for (int i = midIndex; i < length; i++)
            rightHalfArray[i - midIndex] = arr[i];
        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);

        int leftSize = leftHalfArray.length, rightSize = rightHalfArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalfArray[i].compareTo(rightHalfArray[j]) <= 0) {
                arr[k] = leftHalfArray[i];
                i++;
            } else {
                arr[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arr[k] = leftHalfArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightHalfArray[j];
            j++;
            k++;
        }
        return arr;
    }

    public static Object[] mergeSortComparator(Comparator c, Object[] objects) {
        int length = objects.length;
        if (length < 2)
            return objects;
        int midIndex = length / 2;
        Object[] leftHalfArray = new Comparable[midIndex];          //split the array to 2
        Object[] rightHalfArray = new Comparable[length - midIndex];
        for (int i = 0; i < midIndex; i++)
            leftHalfArray[i] = objects[i];  //write each array
        for (int i = midIndex; i < length; i++)
            rightHalfArray[i - midIndex] = objects[i];
        mergeSortComparator(c, leftHalfArray);
        mergeSortComparator(c, rightHalfArray);

        int leftSize = leftHalfArray.length, rightSize = rightHalfArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (c.compare(leftHalfArray[i], rightHalfArray[j]) <= 0) {
                objects[k] = leftHalfArray[i];
                i++;
            } else {
                objects[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            objects[k] = leftHalfArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            objects[k] = rightHalfArray[j];
            j++;
            k++;
        }
        return objects;
    }
}