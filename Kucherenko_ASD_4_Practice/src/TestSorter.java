
import java.util.Arrays;


public class TestSorter {
    public static void main(String[] args) {
        Films[] arr = {new Films("Lord of the rings", 93000000), new Films("Pulp Fiction", 8500000),
                new Films("Lighthouse", 11000000)};
        Sorter s = new Sorter();
        //s.bubbleSort(arr);
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
