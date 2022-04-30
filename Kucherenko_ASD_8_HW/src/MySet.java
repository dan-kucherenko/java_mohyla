public class MySet<T extends Number> {
    private MyList firstList;
    private MyList secondList;

    public MySet(MyList list1, MyList list2) {
        this.firstList = list1;
        this.secondList = list2;
    }

    public void addIfNotExist(T data, MyList list) {
        if (list.find(data)) {
            return;
        } else
            list.add(data);
    }

    public MyList union(MyList list1, MyList list2, MyList result) {
        MyList.Node t1 = list1.head;
        MyList.Node t2 = list2.head;

        while (t1 != null) {
            result.push(t1.data);
            t1 = t1.next;
        }
        while (t2 != null) {
            if (!isPresent(result, t2.data))
                result.push(t2.data);
            t2 = t2.next;
        }
        result.sort();
        return result;
    }

    boolean isPresent(MyList list, Number data) {
        MyList.Node node = list.head;
        while (node != null) {
            if (node.data == data)
                return true;
            node = node.next;
        }
        return false;
    }
}
