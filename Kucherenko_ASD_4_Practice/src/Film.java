public class Film implements Comparable<Film> {
    private int budget, releaseYear;
    private String title;

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
