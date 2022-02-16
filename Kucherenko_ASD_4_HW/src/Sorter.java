import java.util.Comparator;

public class Sorter {
    public static Comparable[] insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
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
            Object key = objects[i];
            int j = i - 1;
            while (j >= 0 && c.compare(key, objects[j]) < 0) {
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
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.3);
            swapped = false;
            for (int i = 0; i < arr.length - gap; i++) {
                if (arr[i].compareTo(arr[i + gap]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }

    public static Object[] combSortComparator(Comparator c, Object[] objects) {
        int gap = objects.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.3);
            swapped = false;
            for (int i = 0; i < objects.length - gap; i++) {
                if (c.compare(objects[i], objects[i + gap]) > 0) {
                    Object temp = objects[i];
                    objects[i] = objects[i + gap];
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
                int j;
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;

            }
        }
        return arr;
    }

    public static Object[] shellSortComparator(Comparator c, Object[] objects) {
        for (int gap = objects.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < objects.length; i += 1) {
                Object temp = objects[i];
                int j;
                for (j = i; j >= gap && c.compare(objects[j - gap], temp) > 0; j -= gap)
                    objects[j] = objects[j - gap];
                objects[j] = temp;
            }
        }
        return objects;
    }
}