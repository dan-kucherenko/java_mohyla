public class TestSorter {
    public static void main(String[] args) {
        Sorter s = new Sorter();
        Comparable[] newArray = {1, 5, 7, 4, 9};
        s.bubbleSort(newArray);
        System.out.println(s.printSorted());

    }
}
