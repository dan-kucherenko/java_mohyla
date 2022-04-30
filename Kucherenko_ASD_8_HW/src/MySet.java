public class MySet<T extends Number> {
    public MyList list;
    int length;

    public MySet(MyList list) {
        this.list = list;
        this.length = list.length;
    }

    public MySet() {

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

        return result;
    }
    private void push(T newData) {
        list.add(newData);
    }

    public String toString() {
        String listAsString = "Your list is: [ ";
        for (int i = 0; i < list.length; i++) {
            if (list.get(0) == null)
                return "Your set is empty";
            else
                listAsString += list.get(i) + " ";
        }
        return listAsString + ']';
    }
}
