
import java.util.Arrays;

public class TestSorter {
    public static void main(String[] args) {
        Film[] filmsList = {new Film("Lord of the rings", 93000000, 2001), new Film("Pulp Fiction", 8500000, 1994),
                new Film("Lighthouse", 11000000, 2019)};
        Sorter s = new Sorter();
        s.bubbleSort(filmsList); //budget compairing with bubble sorter
        s.selectionSort(filmsList); //budget compairing with selection sorter

        CompareFilmTitle compareFilmTitle = new CompareFilmTitle();
        //s.bubbleSortComparator(compareFilmTitle, filmsList); //comparing title through bubble sort with comparator
        //s.selectionSorterComparator(compareFilmTitle, filmsList);//comparing title through selection sort with comparator

        CompareFilmReleaseYear compareFilmReleaseYear = new CompareFilmReleaseYear();
        //s.bubbleSortComparator(compareFilmReleaseYear, filmsList); //comparing release year through bubble sort with comparator
        s.selectionSorterComparator(compareFilmReleaseYear, filmsList);//comparing release year through selection sort with comparator
        System.out.println(Arrays.toString(filmsList));


    }
}
