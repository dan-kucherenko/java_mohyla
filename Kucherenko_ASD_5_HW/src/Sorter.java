import java.util.Comparator;
import java.util.Random;

public class Sorter {
    public static Comparable[] bubbleSort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    public static Object[] bubbleSortComparator(Comparator c, Object[] objects) {
        for (int i = 0; i < objects.length - 1; i++) {
            for (int j = 0; j < objects.length - i - 1; j++) {
                if (c.compare(objects[j], objects[j + 1]) > 0) {
                    Object temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }

            }

        }
        return objects;
    }

    public static Comparable[] selectionSort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[min_idx]) < 0)
                    min_idx = j;
            Comparable temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static Object[] selectionSorterComparator(Comparator c, Object[] objects) {
        for (int i = 0; i < objects.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < objects.length; j++)
                if (c.compare(objects[j], objects[min_idx]) < 0)
                    min_idx = j;
            Object temp = objects[min_idx];
            objects[min_idx] = objects[i];
            objects[i] = temp;
        }
        return objects;
    }

    public static Comparable[] insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[i].compareTo(arr[j]) < 0) {
                Comparable temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static Object[] insertionSortComparator(Comparator c, Object[] objects) {
        for (int i = 1; i < objects.length; i++) {
            int j = i - 1;
            while (j >= 0 && c.compare(objects[i], objects[j]) < 0) {
                Object temp = objects[j];
                objects[j] = objects[j + 1];
                objects[j + 1] = temp;
                j--;
            }

        }
        return objects;
    }

    public static Comparable[] combSort(Comparable[] arr) {
        int gap = arr.length;
        boolean swapped = false;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.3);
            for (int i = 0; i + gap < arr.length; i++) {
                if (arr[i].compareTo(arr[i + gap]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }

    public static Object[] combSortComparator(Comparator c, Object[] objects) {
        int gap = objects.length;
        boolean swapped = false;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.3);
            for (int i = 0; i + gap < objects.length; i++) {
                if (c.compare(objects[i], objects[i + gap]) > 0) {
                    Object temp = objects[i];
                    objects[i] = objects[i + 1];
                    objects[i + gap] = temp;
                    swapped = true;
                }
            }
        }
        return objects;
    }

    public static Comparable[] shellSort(Comparable[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i += 1) {
                Comparable temp = arr[i];
                for (int j = i; j >= gap && arr[j - gap].compareTo(temp) < 0; j--) {
                    arr[j] = arr[j - gap];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static Object[] shellSortComparator(Comparator c, Object[] objects) {
        for (int gap = objects.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < objects.length; i += 1) {
                Object temp = objects[i];
                for (int j = i; j >= gap && c.compare(objects[j - gap], temp) > 0; j -= gap) {
                    objects[j] = objects[j - gap];
                    objects[j] = temp;
                }
            }
        }
        return objects;
    }

    public static Comparable[] quickSort(Comparable[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return arr;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        Comparable pivot = arr[pivotIndex];
        Comparable temp3 = arr[pivotIndex];
        arr[pivotIndex] = arr[highIndex];
        arr[highIndex] = temp3;
        int leftPointer = lowIndex, rightPointer = highIndex;
        while (arr[lowIndex].compareTo(arr[highIndex]) < 0) {
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
}