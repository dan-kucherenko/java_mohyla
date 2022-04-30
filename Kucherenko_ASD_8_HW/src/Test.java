public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(4);
        MyList<Integer> myList2 = new MyList<>();
//        myList2.add(2);
        myList2.add(5);
        myList2.add(6);
        myList2.add(9);
        myList2.add(8);
        MyList<Integer> result = new MyList<>();
        MySet<Integer> mySet1 = new MySet<>(myList1);
        MySet<Integer> mySet2 = new MySet<>(myList2);
        MySet<Integer> resultSet = new MySet<>(result);
        System.out.println("Union: " + (resultSet.union(mySet1, mySet2, resultSet).toString()));
        System.out.println("Intersection: " + (resultSet.intersection(mySet1, mySet2, resultSet).toString()));
        System.out.println("Difference: " + (resultSet.difference(mySet1, mySet2, resultSet).toString()));
        System.out.println("Merge: " + (resultSet.merge(mySet1, mySet2, resultSet)));


    }
}
