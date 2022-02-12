import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorter {
    private Comparable[] arr;

    public Comparable[] bubbleSort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j + 1];
                    temp = arr[j + 1];
                }

            }
        }
        arr = this.arr;
        return arr;
    }

    public String printSorted() {
        String arrayToString = Arrays.toString(arr);
        return arrayToString;
    }

}
