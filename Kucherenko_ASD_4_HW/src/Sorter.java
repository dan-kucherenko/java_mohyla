import java.util.Comparator;

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
}