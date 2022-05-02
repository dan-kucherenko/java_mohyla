public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(1, false);
//        System.out.println(myQueue.add(null));
        System.out.println(myQueue.add(3));
        System.out.println(myQueue.add(4));
        System.out.println(myQueue);
    }

}
