
import java.util.Arrays;


public class TestSorter {
    public static void main(String[] args) {
        Film[] filmsList = {new Film("Lord of the rings", 93000000, 2001), new Film("Pulp Fiction", 8500000, 1994),
                new Film("Lighthouse", 11000000, 2019)};
        Sorter s = new Sorter();
        //s.bubbleSort(arr);
        s.selectionSort(filmsList);
        System.out.println(Arrays.toString(filmsList));


    }
}
