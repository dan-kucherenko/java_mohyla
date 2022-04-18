import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;

public class OperationsWithSets {
    private final int ARRAY_LENGTH = 100;

    void addRandomElements(Integer[] set_1, Integer[] set_2) {
        Random r = new Random();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            set_1[i] = r.nextInt(2);
            set_2[i] = r.nextInt(2);
        }
    }

    LinkedHashSet<Integer> union(Integer[] set_1, Integer[] set_2, LinkedHashSet<Integer> result) {
        result.addAll(Arrays.asList(set_1));
        result.addAll(Arrays.asList(set_2));
        return result;

    }

    LinkedHashSet<Integer> intersection(Integer[] set_1, Integer[] set_2, LinkedHashSet<Integer> result) {
        result.clear();
        result.addAll(Arrays.asList(set_1));
        result.retainAll(Arrays.asList(set_2));
        return result;
    }

    LinkedHashSet<Integer> difference(Integer[] set_1, Integer[] set_2, LinkedHashSet<Integer> result) {
        result.clear();
        result.addAll(Arrays.asList(set_1));
        result.removeAll(Arrays.asList(set_2));
        return result;
    }

    LinkedHashSet<Integer> merge(Integer[] set_1, Integer[] set_2, LinkedHashSet<Integer> result) {
        if (intersection(set_1, set_2, result) == null)
            union(set_1, set_2, result);
        return result;
    }

    boolean member(Integer x, LinkedHashSet<Integer> result) {
        boolean hasX = false;
        if (result.contains(x))
            hasX = true;
        return hasX;
    }

    LinkedHashSet<Integer> makeNull(LinkedHashSet<Integer> set) {
        set = null;
        return set;
    }

    LinkedHashSet<Integer> insert(Integer x, LinkedHashSet<Integer> result) {
        result.add(x);
        return result;
    }

    LinkedHashSet<Integer> remove(Integer x, LinkedHashSet<Integer> result) {
        result.remove(x);
        return result;
    }

    Integer[] assign(Integer[] set_1, Integer[] set_2) {
        set_1 = set_2;
        return set_1;
    }
    
}
