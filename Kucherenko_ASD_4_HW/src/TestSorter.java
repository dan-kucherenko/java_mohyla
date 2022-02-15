
import java.util.Arrays;

public class TestSorter {
    public static void main(String[] args) {
        Film[] filmsList = {new Film("Lord of the rings", 93000000, 2001), new Film("Pulp Fiction", 8500000, 1994),
                new Film("Lighthouse", 11000000, 2019)};
        System.out.println("Your array before sorting: \n" + Arrays.toString(filmsList));
        Sorter s = new Sorter();
        s.bubbleSort(filmsList); //budget compairing with bubble sorter
        System.out.println('\n' + "Your array is sorted by budget through bubble sorter: \n" + Arrays.toString(filmsList));

        s.selectionSort(filmsList); //budget compairing with selection sorter
        System.out.println('\n' + "Your array is sorted by budget through selection sorter: \n" + Arrays.toString(filmsList));

        s.insertionSort(filmsList);
        System.out.println('\n' + "Your array is sorted by budget through insertion sorter: \n" + Arrays.toString(filmsList));

        s.combSort(filmsList);
        System.out.println('\n' + "Your array is sorted by budget through comb sorter: \n" + Arrays.toString(filmsList));

        s.shellSort(filmsList);
        System.out.println('\n' + "Your array is sorted by budget through shell sorter: \n" + Arrays.toString(filmsList));

        CompareFilmTitle compareFilmTitle = new CompareFilmTitle();
        s.bubbleSortComparator(compareFilmTitle, filmsList); //comparing title through bubble sort with comparator
        System.out.println('\n' + "Your array is sorted by title through bubble sorter: \n" + Arrays.toString(filmsList));

        s.selectionSorterComparator(compareFilmTitle, filmsList);//comparing title through selection sort with comparator
        System.out.println('\n' + "Your array is sorted by title through selection sorter: \n" + Arrays.toString(filmsList));

        s.insertionSortComparator(compareFilmTitle, filmsList);
        System.out.println('\n' + "Your array is sorted by title through insertion sorter: \n" + Arrays.toString(filmsList));

        s.combSortComparator(compareFilmTitle, filmsList);
        System.out.println('\n' + "Your array is sorted by title through comb sorter: \n" + Arrays.toString(filmsList));

        s.shellSortComparator(compareFilmTitle, filmsList);
        System.out.println('\n' + "Your array is sorted by title through shell sorter: \n" + Arrays.toString(filmsList));

        CompareFilmReleaseYearFromTheOldest compareFilmReleaseYearFromTheOldest = new CompareFilmReleaseYearFromTheOldest();
        s.bubbleSortComparator(compareFilmReleaseYearFromTheOldest, filmsList); //comparing release year through bubble sort with comparator
        System.out.println('\n' + "Your array is sorted by release year from the oldest through bubble sorter: \n" + Arrays.toString(filmsList));

        s.selectionSorterComparator(compareFilmReleaseYearFromTheOldest, filmsList);//comparing release year through selection sort with comparator
        System.out.println('\n' + "Your array is sorted by release year from the oldest through selection sorter: \n" + Arrays.toString(filmsList));

        s.insertionSortComparator(compareFilmReleaseYearFromTheOldest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the oldest through insertion sorter: \n" + Arrays.toString(filmsList));

        s.combSortComparator(compareFilmReleaseYearFromTheOldest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the oldest through comb sorter: \n" + Arrays.toString(filmsList));

        s.shellSortComparator(compareFilmReleaseYearFromTheOldest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the oldest through shell sorter: \n" + Arrays.toString(filmsList));

        CompareFilmReleaseYearFromTheYoungest compareFilmReleaseYearFromTheYoungest = new CompareFilmReleaseYearFromTheYoungest();
        s.bubbleSortComparator(compareFilmReleaseYearFromTheYoungest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through bubble sort: \n" + Arrays.toString(filmsList));

        s.selectionSorterComparator(compareFilmReleaseYearFromTheYoungest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through selection sort: \n" + Arrays.toString(filmsList));

        s.insertionSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through insertion sort: \n" + Arrays.toString(filmsList));

        s.combSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through comb sort: \n" + Arrays.toString(filmsList));

        s.shellSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through shell sort: \n" + Arrays.toString(filmsList));
    }
}
