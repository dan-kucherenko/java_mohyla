public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(3, true);
        myQueue.add(3);
        System.out.println(myQueue);
        System.out.println("Head of queue is: " + myQueue.element());
        myQueue.offer(4);
        myQueue.offer(null);
        myQueue.offer(6);
//        System.out.println(myQueue);
//        System.out.println("Polled head: " + myQueue.poll());
//        System.out.println(myQueue);
//        System.out.println("Removed head: " + myQueue.remove());
//        System.out.println(myQueue);
//        System.out.println("Peek of queue is: " + myQueue.peek());
//        System.out.println(myQueue);
//        System.out.println("Queue is empty: " + myQueue.empty());
        System.out.println(myQueue);
        System.out.println("Your element index is: "+ myQueue.search(null));

    }

}
