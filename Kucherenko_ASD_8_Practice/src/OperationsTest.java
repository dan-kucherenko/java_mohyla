import java.util.LinkedHashSet;

public class OperationsTest {
    public static void main(String[] args) {
        Integer[] set_1 = new Integer[100], set_2 = new Integer[100];
        LinkedHashSet<Integer> result_set = new LinkedHashSet<>();
        OperationsWithSets ows = new OperationsWithSets();
        ows.addRandomElements(set_1, set_2);
        System.out.println("Union: " + ows.union(set_1, set_2, result_set));
        System.out.println("Intersection: " + ows.intersection(set_1, set_2, result_set));
        System.out.println("Difference: " + ows.difference(set_1, set_2, result_set));
        System.out.println("Merge: " + ows.merge(set_1, set_2, result_set));
        System.out.println("Member: " + ows.member(2, result_set));
        System.out.println("Make null: " + ows.makeNull(result_set));
        System.out.println("Insert: " + ows.insert(3, result_set));
        System.out.println("Remove: " + ows.remove(4, result_set));
        System.out.println("Assign: " + ows.assign(set_1, set_2));
    }
}
