public class MySet<T extends Number> {
    public MyList list;
    int length;

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
        MySet intersectionResult = intersection(set1, set2, result);
        if (intersectionResult.list.length == 0)
            union(set1, set2, result);
        else
            return null;
        return result;
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
