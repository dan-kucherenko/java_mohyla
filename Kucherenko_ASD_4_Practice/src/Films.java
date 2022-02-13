public class Films implements Comparable<Films> {
    private int budget;
    private String title;

    public Films(String title, int budget) {
        this.title = title;
        this.budget = budget;
    }

    @Override
    public int compareTo(Films that) {
        return this.budget - that.budget;
    }

    @Override
    public String toString() {
        return "Films{" +
                "budget=" + budget +
                ", title='" + title + '\'' +
                '}';
    }
}
