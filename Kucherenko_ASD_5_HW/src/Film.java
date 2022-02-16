import java.util.Comparator;

public class Film implements Comparable<Film> {
    protected int budget, releaseYear;
    protected String title;


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
                "budget = " + budget +
                ", releaseYear = " + releaseYear +
                ", title = '" + title + '\'' +
                "}\n";
    }
}

class CompareFilmTitle implements Comparator<Film> {
    @Override
    public int compare(Film f1, Film f2) {
        int i = 0;
        while (f1.title.charAt(i) - f2.title.charAt(i) == 0) {
            i++;
            return f1.title.charAt(i) - f2.title.charAt(i);
        }
        return f1.title.charAt(i) - f2.title.charAt(i);
    }
}

class CompareFilmReleaseYearFromTheOldest implements Comparator<Film> {
    @Override
    public int compare(Film f1, Film f2) {
        return f1.releaseYear - f2.releaseYear;
    }
}

class CompareFilmReleaseYearFromTheYoungest implements Comparator<Film> {
    @Override
    public int compare(Film f1, Film f2) {
        return f2.releaseYear - f1.releaseYear;
    }
}