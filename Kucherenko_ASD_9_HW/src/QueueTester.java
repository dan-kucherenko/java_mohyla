public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(3, true);
        System.out.println(myQueue.add(2));
        System.out.println(myQueue.add(null));
        System.out.println(myQueue.add(3));
        System.out.println("Your head of queue is: " + myQueue.element());
        System.out.println(myQueue);
    }

}
