public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(4);
        MyList<Integer> myList2 = new MyList<>();
        myList2.add(2);
        myList2.add(5);
        myList2.add(6);
        myList2.add(9);
        myList2.add(8);
        MyList<Integer> result = new MyList<>();
        MySet<Integer> mySet = new MySet<>(myList1, myList2);
        System.out.println("Union: " + (mySet.union(myList1, myList2,result)).toString());


    }
}
