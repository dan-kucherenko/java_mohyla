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
}
