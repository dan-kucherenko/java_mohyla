public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(3, false);
        myQueue.offer(3);
//        myQueue.offer(4);
//        myQueue.offer(null);
//        myQueue.offer(6);
        System.out.println("Head of queue is: " + myQueue.element());
//        System.out.println(myQueue);
//        System.out.println("Polled head: " + myQueue.poll());
//        System.out.println(myQueue);
//        System.out.println("Head head of queue is: " + myQueue.element());
//        System.out.println("Removed head: " + myQueue.remove());
        System.out.println(myQueue);
        System.out.println("Peek of queue is: " + myQueue.peek());
        System.out.println("Queue is empty: " + myQueue.empty());

    }

}
