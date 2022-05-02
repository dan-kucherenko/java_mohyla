public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(1, true);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue);
    }

}
