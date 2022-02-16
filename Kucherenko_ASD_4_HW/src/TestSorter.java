
import java.util.Arrays;

public class TestSorter {
    public static void main(String[] args) {
        Film[] filmsList = {new Film("Lord of the rings", 93, 2001), new Film("Pulp Fiction", 8, 1994),
                new Film("Lighthouse", 11, 2019), new Film("Snatch", 10, 2000)};
        System.out.println("Your array before sorting: \n" + Arrays.toString(filmsList));
        Sorter s = new Sorter();
//        s.insertionSort(filmsList);
//        System.out.println('\n' + "Your array is sorted by budget through insertion sorter: \n" + Arrays.toString(filmsList));

//        s.combSort(filmsList);
//        System.out.println('\n' + "Your array is sorted by budget through comb sorter: \n" + Arrays.toString(filmsList));

        s.shellSort(filmsList);
        System.out.println('\n' + "Your array is sorted by budget through shell sorter: \n" + Arrays.toString(filmsList));

        CompareFilmTitle compareFilmTitle = new CompareFilmTitle();
//        s.insertionSortComparator(compareFilmTitle, filmsList);
//        System.out.println('\n' + "Your array is sorted by title through insertion sorter: \n" + Arrays.toString(filmsList));
//
//        s.combSortComparator(compareFilmTitle, filmsList);
//        System.out.println('\n' + "Your array is sorted by title through comb sorter: \n" + Arrays.toString(filmsList));

        s.shellSortComparator(compareFilmTitle, filmsList);
        System.out.println('\n' + "Your array is sorted by title through shell sorter: \n" + Arrays.toString(filmsList));
//
        CompareFilmReleaseYearFromTheOldest compareFilmReleaseYearFromTheOldest = new CompareFilmReleaseYearFromTheOldest();
//        s.insertionSortComparator(compareFilmReleaseYearFromTheOldest, filmsList);
//        System.out.println('\n' + "Your array is sorted by release year from the oldest through insertion sorter: \n" + Arrays.toString(filmsList));
//
//        s.combSortComparator(compareFilmReleaseYearFromTheOldest, filmsList);
//        System.out.println('\n' + "Your array is sorted by release year from the oldest through comb sorter: \n" + Arrays.toString(filmsList));

        s.shellSortComparator(compareFilmReleaseYearFromTheOldest, filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the oldest through shell sorter: \n" + Arrays.toString(filmsList));

        CompareFilmReleaseYearFromTheYoungest compareFilmReleaseYearFromTheYoungest = new CompareFilmReleaseYearFromTheYoungest();
//        s.insertionSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
//        System.out.println('\n' + "Your array is sorted by release year from the youngest through insertion sort: \n" + Arrays.toString(filmsList));

//        s.combSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
//        System.out.println('\n' + "Your array is sorted by release year from the youngest through comb sort: \n" + Arrays.toString(filmsList));

        s.shellSortComparator(compareFilmReleaseYearFromTheYoungest,filmsList);
        System.out.println('\n' + "Your array is sorted by release year from the youngest through shell sort: \n" + Arrays.toString(filmsList));
    }
}
