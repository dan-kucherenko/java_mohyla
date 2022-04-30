import java.util.Comparator;

public class MySet<T extends Number> {
    public MyList list;
    int length;
    MySet intersectionResult;

    public MySet(MyList list) {
        this.list = list;
        this.length = list.length;
    }

//    public void addIfNotExist(T data, MyList list) {
//        if (list.find(data)) {
//            return;
//        } else
//            list.add(data);
//    }

    public MySet union(MySet set1, MySet set2, MySet result) {
        for (int i = 0; i < set1.length; i++) {
            if (set1.list.get(i) != null)
                result.push(set1.list.get(i));
        }
        for (int j = 0; j < set2.length; j++) {
            if (set2.list.get(j) != null) {
                if (!result.list.find(set2.list.get(j)))
                    result.push(set2.list.get(j));
            }
        }
        return result;
    }

    public MySet intersection(MySet set1, MySet set2, MySet result) {
        result.list.clear();
        for (int i = 0; i < set1.length; i++) {
            if (set1.list.find(set2.list.get(i)))
                result.push(set2.list.get(i));
        }
        intersectionResult = result;
        return result;
    }

    public MySet difference(MySet set1, MySet set2, MySet result) {
        int i = 0;
        while (set1.list.get(i) != null) {
            if (!set2.list.find(set1.list.get(i)))
                result.push(set1.list.get(i));
            i++;
        }
        return result;
    }

    public MySet merge(MySet set1, MySet set2, MySet result) {

        if (intersectionResult.list.length == 0)
            union(set1, set2, result);
        else
            return null;
        return result;
    }

    public boolean member(T num, MySet set) {
        boolean isMember = false;
        for (int i = 0; i < set.length; i++) {
            if (set.list.get(i) == num)
                isMember = true;
        }
        return isMember;
    }

    public void makeNull(MySet set) {
        set = null;
    }

    public void insert(T num, MySet set) {
        for (int i = 0; i < set.length; i++) {
            if (set.list.get(i) == num)
                System.out.println("Your num is already present in this set");
        }
        set.list.add(num);
    }

    public void delete(T num, MySet set) {
        if (set.list.find(num))
            set.list.remove(num);
        else
            System.out.println("There is no inserted num in the set");
    }

    public MySet assign(MySet set1, MySet set2) {
        set1 = set2;
        return set1;
    }

    public boolean equal(MySet set1, MySet set2) {
        boolean isEqual = false;
        if (set1 == set2)
            isEqual = true;
        return isEqual;
    }

//    class CompareGenericsInSets implements Comparator<Number> {
////        @Override
////        public int compare(Object decimalToCompare, Object thatDecimalToCompare) {
////            return decimalToCompare - thatDecimalToCompare;
////        }
//
//        @Override
//        public int compare(T o1, T o2) {
//            int result = (int) (o1 - o2);
//            return 0;
//        }
//    }
//
//    T minInteger(MySet set) {
//        CompareGenericsInSets compareIntegers = new CompareGenericsInSets();
//        T min = (T) set.list.get(0);
//        for (int i = 0; i < set.length; i++) {
//            if (compareIntegers.compare(min, set.list.get(i + 1)) > 0)
//                min = set.list.get(i + 1);
//        }
//        return min;
//    }
//
//    Integer maxInteger(LinkedHashSet<Integer> set) {
//        CompareIntegersInSets compareIntegers = new CompareIntegersInSets();
//        ArrayList<Integer> setAsAnArrayList = new ArrayList<>(set);
//        int max = setAsAnArrayList.get(0);
//        for (int i = 0; i < set.size() - 1; i++) {
//            if (compareIntegers.compare(max, setAsAnArrayList.get(i + 1)) < 0)
//                max = setAsAnArrayList.get(i + 1);
//        }
//        return max;
//    }

    String find(T x, MySet set1, MySet set2) {
        if (intersectionResult.list.length == 0) {
            if (set1.list.find(x))
                return "Set_1 contains the decimal you have inserted";
            else if (set2.list.find(x))
                return "Set_2 contains the decimal you have inserted";
            else
                return "None sets contains the decimal you have inserted";
        } else
            return "Your sets have intersection";
    }

    private void push(T newData) {
        list.add(newData);
    }

    public String toString() {
        String listAsString = "Your list is: [ ";
        if (list.get(0) == null)
            return "Your set is empty";
        else {
            list.sort();
            for (int i = 0; i < list.length; i++)
                listAsString += list.get(i) + " ";
            return listAsString + ']';
        }
    }
}
