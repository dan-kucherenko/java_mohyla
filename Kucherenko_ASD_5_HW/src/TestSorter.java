
import java.util.Arrays;

public class TestSorter {
    public static void main(String[] args) {
        Film[] filmsList = {new Film("Lord of the rings", 93, 2001), new Film("Pulp Fiction", 8, 1994),
                new Film("Lighthouse", 11, 2019), new Film("Snatch", 10, 2000)};
        System.out.println("Your array before sorting: \n" + Arrays.toString(filmsList));
        Sorter s = new Sorter();
        /*To see the working of the program choose the
        sorter you want to use and comment others*/

        s.quickSort(filmsList, 0, filmsList.length - 1);
        System.out.println('\n' + "Your array is sorted by budget through quick sorter: \n" + Arrays.toString(filmsList));
        s.mergeSort(filmsList);
        System.out.println('\n' + "Your array is sorted by budget through merge sorter: \n" + Arrays.toString(filmsList));


        CompareFilmTitle compareFilmTitle = new CompareFilmTitle();
        s.quickSortComparator(compareFilmTitle, filmsList, 0, filmsList.length - 1);
        System.out.println('\n' + "Your array is sorted by title through quick sort: \n" + Arrays.toString(filmsList));
        s.mergeSortComparator(compareFilmTitle,filmsList);
        System.out.println('\n' + "Your array is sorted by title through merge sort: \n" + Arrays.toString(filmsList));


        CompareFilmReleaseYearFromTheOldest compareFilmReleaseYearFromTheOldest = new CompareFilmReleaseYearFromTheOldest();
        s.quickSortComparator(compareFilmReleaseYearFromTheOldest, filmsList, 0, filmsList.length - 1);
        System.out.println('\n' + "Your array is sorted by release year from the oldest through quick sort: \n" + Arrays.toString(filmsList));
        s.mergeSortComparator(compareFilmReleaseYearFromTheOldest,filmsList);
        System.out.println('\n' + "Your array is sorted by title through merge sort: \n" + Arrays.toString(filmsList));

        CompareFilmReleaseYearFromTheYoungest compareFilmReleaseYearFromTheYoungest = new CompareFilmReleaseYearFromTheYoungest();
        s.quickSortComparator(compareFilmReleaseYearFromTheYoungest, filmsList, 0, filmsList.length - 1);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through quick sort: \n" + Arrays.toString(filmsList));
        s.mergeSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
        System.out.println('\n' + "Your array is sorted by title through merge sort: \n" + Arrays.toString(filmsList));

    }
}
