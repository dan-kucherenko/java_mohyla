
import java.util.Arrays;

public class TestSorter {
    public static void main(String[] args) {
        Film[] filmsList = {new Film("Lord of the rings", 93000000, 2001), new Film("Pulp Fiction", 8500000, 1994),
                new Film("Lighthouse", 11000000, 2019), new Film("Snatch", 10000000, 2000)};
        System.out.println("Your array before sorting: \n" + Arrays.toString(filmsList));
        Sorter s = new Sorter();
        /*To see the working of the program choose the
        sorter you want to use and comment others*/

        s.bubbleSort(filmsList); //budget compairing with bubble sorter
        System.out.println('\n' + "Your array is sorted by budget through bubble sorter: \n" + Arrays.toString(filmsList));
        s.selectionSort(filmsList); //budget compairing with selection sorter
        System.out.println('\n' + "Your array is sorted by budget through selection sorter: \n" + Arrays.toString(filmsList));

        CompareFilmTitle compareFilmTitle = new CompareFilmTitle();
        s.bubbleSortComparator(compareFilmTitle, filmsList); //comparing title through bubble sort with comparator
        System.out.println('\n' + "Your array is sorted by title through bubble sorter: \n" + Arrays.toString(filmsList));
        s.selectionSorterComparator(compareFilmTitle, filmsList);//comparing title through selection sort with comparator
        System.out.println('\n' + "Your array is sorted by title through selection sorter: \n" + Arrays.toString(filmsList));

        CompareFilmReleaseYearFromTheOldest compareFilmReleaseYearFromTheOldest = new CompareFilmReleaseYearFromTheOldest();
        s.bubbleSortComparator(compareFilmReleaseYearFromTheOldest, filmsList); //comparing release year through bubble sort with comparator
        System.out.println('\n' + "Your array is sorted by release year from the oldest through bubble sorter: \n" + Arrays.toString(filmsList));
        s.selectionSorterComparator(compareFilmReleaseYearFromTheOldest, filmsList);//comparing release year through selection sort with comparator
        System.out.println('\n' + "Your array is sorted by release year from the oldest through selection sorter: \n" + Arrays.toString(filmsList));

        CompareFilmReleaseYearFromTheYoungest compareFilmReleaseYearFromTheYoungest = new CompareFilmReleaseYearFromTheYoungest();
        s.bubbleSortComparator(compareFilmReleaseYearFromTheYoungest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through bubble sort: \n" + Arrays.toString(filmsList));

        s.selectionSorterComparator(compareFilmReleaseYearFromTheYoungest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through selection sort: \n" + Arrays.toString(filmsList));


    }
}
