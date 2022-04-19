import java.util.Arrays;
import java.util.LinkedHashSet;

public class OperationsTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> result_set = new LinkedHashSet<>();
        LinkedHashSet<Integer> set_1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set_2 = new LinkedHashSet<>();
        OperationsWithSets ows = new OperationsWithSets();
        ows.addRandomElements(set_1, set_2);
        System.out.println("Set 1: " + set_1);
        System.out.println("Set 2: " + set_2);
//        System.out.println("Union: " + ows.union(set_1, set_2, result_set));
        System.out.println("Intersection: " + ows.intersection(set_1, set_2, result_set));
//        System.out.println("Difference: " + ows.difference(set_1, set_2, result_set));
        System.out.println("Merge: " + ows.merge(set_1, set_2, result_set));
//        System.out.println("Member: " + ows.member(2, set_1));
//        System.out.println("Make null: " + ows.makeNull(set_1));
//        System.out.println("Insert: " + ows.insert(3, set_2));
        System.out.println("Remove: " + ows.remove(4, set_1));
        System.out.println("Assign: " + ows.assign(set_1, set_2));
//        System.out.println("Min: " + ows.min(set_1));
//        System.out.println("Max: " + ows.max(set_2));
        System.out.println("Equal: " + ows.equal(set_1, set_2));
        System.out.println("Find: " + ows.find(5, set_1, set_2));

    }
}
