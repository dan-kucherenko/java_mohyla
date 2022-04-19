import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Random;

public class OperationsWithSets {
    private final int ARRAY_LENGTH = 100;
    private LinkedHashSet<Integer> intersection_result;

    void addRandomElements(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2) {
        Integer[] baseArray = new Integer[ARRAY_LENGTH];
        Integer[] booleanSet1 = new Integer[ARRAY_LENGTH];
        Integer[] booleanSet2 = new Integer[ARRAY_LENGTH];
        for (int i = 0; i < 100; i++)
            baseArray[i] = i + 1;
        Random r = new Random();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            booleanSet1[i] = r.nextInt(2);
            booleanSet2[i] = r.nextInt(2);
        }
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (booleanSet1[i] == 1)
                set_1.add(baseArray[i]);
            if (booleanSet2[i] == 1)
                set_2.add(baseArray[i]);
        }
    }

    LinkedHashSet<Integer> union(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2,
                                 LinkedHashSet<Integer> result) {
        result.addAll(set_1);
        result.addAll(set_2);
        return result;

    }

    LinkedHashSet<Integer> intersection(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2,
                                        LinkedHashSet<Integer> result) {
        intersection_result = new LinkedHashSet<>();
        intersection_result.addAll(set_1);
        intersection_result.retainAll(set_2);
        if (intersection_result.isEmpty())
            return null;
        return result = intersection_result;
    }

    LinkedHashSet<Integer> difference(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2,
                                      LinkedHashSet<Integer> result) {
        result.clear();
        result.addAll(set_1);
        result.removeAll(set_2);
        return result;
    }

    LinkedHashSet<Integer> merge(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2,
                                 LinkedHashSet<Integer> result) {
        result.clear();
        if (intersection_result == null)
            union(set_1, set_2, result);
        return result;
    }

    boolean member(Integer x, LinkedHashSet<Integer> set) {
        return set.contains(x);
    }

    String makeNull(LinkedHashSet<Integer> set) {
        set = null;
        return "Your set is now null";
    }

    LinkedHashSet<Integer> insert(Integer x, LinkedHashSet<Integer> set) {
        set.add(x);
        return set;
    }

    LinkedHashSet<Integer> remove(Integer x, LinkedHashSet<Integer> set) {
        set.remove(x);
        return set;
    }

    void assign(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2) {
        set_1 = set_2;
    }

    static class CompareIntegersInSets implements Comparator<Integer> {
        Integer decimalToCompare;
        @Override
        public int compare(Integer decimalToCompare, Integer thatDecimalToCompare) {
            return decimalToCompare - thatDecimalToCompare;
        }
    }

    Integer min(LinkedHashSet<Integer> set) { //finish later
        int min = 0;
        CompareIntegersInSets compareIntegers = new CompareIntegersInSets();
        ArrayList<Integer> setAsAnArrayList = new ArrayList<>(set);
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (compareIntegers.compare(setAsAnArrayList.get(i), setAsAnArrayList.get(i + 1)) < 0)
                min = setAsAnArrayList.get(i);
        }
        return min;
    }

    Integer max(LinkedHashSet<Integer> set) { //finish later
        int max = 0;
        CompareIntegersInSets compareIntegers = new CompareIntegersInSets();
        ArrayList<Integer> setAsAnArrayList = new ArrayList<>(set);
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (compareIntegers.compare(setAsAnArrayList.get(i), setAsAnArrayList.get(i + 1)) > 0)
                max = setAsAnArrayList.get(i);
        }
        return max;
    }

    boolean equal(LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        boolean isEqual = false;
        if (difference(set_1, set_2, result).isEmpty())
            isEqual = true;
        return isEqual;
    }

    String find(Integer x, LinkedHashSet<Integer> set_1, LinkedHashSet<Integer> set_2) {
        if (intersection_result != null) {
            if (set_1.contains(x))
                return "Set_1 contains the decimal you have inserted";
            else if (set_2.contains(x))
                return "Set_2 contains the decimal you have inserted";
            else
                return "None sets contains the decimal you have inserted";
        } else
            return "Your sets have intersection";
    }

}
