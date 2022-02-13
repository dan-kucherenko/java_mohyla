import java.util.Comparator;

public class Film implements Comparable<Film> {
    private int budget, releaseYear;
    private String title;

    class CompareFilmTitle implements Comparator<Film> {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.title.charAt(0) - f2.title.charAt(0);
        }
    }

    class CompareFilmReleaseYear implements Comparator<Film> {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.releaseYear - f2.releaseYear;
        }
    }

    public Film(String title, int budget, int releaseYear) {
        this.title = title;
        this.budget = budget;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Film that) {
        return this.budget - that.budget;
    }

    @Override
    public String toString() {
        return "Film{" +
                "budget=" + budget +
                ", releaseYear=" + releaseYear +
                ", title='" + title + '\'' +
                '}';
    }
}
