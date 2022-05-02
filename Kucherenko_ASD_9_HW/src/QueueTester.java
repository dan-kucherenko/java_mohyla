public class QueueTester {
    public static void main(String[] args) {
        queueDefaultMethods();
        queueMethodsWithException();
    }

    private static void queueDefaultMethods() {
        System.out.println("Default queue:" + '\n');
        MyQueue<Integer> myQueue = new MyQueue<>(3, true);
        myQueue.add(3);
        System.out.println(myQueue);
        System.out.println("Head of queue is: " + myQueue.element());
        myQueue.offer(4);
        myQueue.offer(null);
        myQueue.offer(6);
        System.out.println(myQueue);
        System.out.println("Polled head: " + myQueue.poll());
        System.out.println(myQueue);
        System.out.println("Removed head: " + myQueue.remove());
        System.out.println(myQueue);
        System.out.println("Peek of queue is: " + myQueue.peek());
        System.out.println(myQueue);
        System.out.println("Queue is empty: " + myQueue.empty());
        System.out.println(myQueue);
        System.out.println("Your element index is: " + myQueue.search(null));

    }

    private static void queueMethodsWithException() {
        System.out.println("\n\nQueue with exceptions examples:" + '\n');
        MyQueue<Integer> myQueueExceptions = new MyQueue<>(3, false);
        myQueueExceptions.add(3);
        System.out.println(myQueueExceptions);
        System.out.println("Head of queue is: " + myQueueExceptions.element());
        myQueueExceptions.offer(4);
        myQueueExceptions.offer(null);
        myQueueExceptions.offer(6);
        myQueueExceptions.offer(7);
        System.out.println(myQueueExceptions);
        System.out.println("Polled head: " + myQueueExceptions.poll());
        System.out.println(myQueueExceptions);
        System.out.println("Removed head: " + myQueueExceptions.remove());
        System.out.println(myQueueExceptions);
        System.out.println("Peek of queue is: " + myQueueExceptions.peek());
        System.out.println(myQueueExceptions);
        System.out.println("Queue is empty: " + myQueueExceptions.empty());
        System.out.println(myQueueExceptions);
        System.out.println("Your element index is: " + myQueueExceptions.search(null));

    }

}
