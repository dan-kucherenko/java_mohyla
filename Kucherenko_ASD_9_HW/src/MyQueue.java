import java.util.NoSuchElementException;

public class MyQueue<T> {
    private Node peek;
    private Node head;
    private int maxSize;
    private int size;
    private boolean areNullElementsAllowed;

    public MyQueue() {
        peek = null;
        head = null;
    }

    public MyQueue(int maxSize, boolean areNullElementsAllowed) {
        this.maxSize = maxSize;
        this.areNullElementsAllowed = areNullElementsAllowed;
        peek = null;
        head = null;
    }

    class Node {
        public T item;
        public Node next;

        public Node(T data) {
            this.item = data;
            next = null;
        }
    }

    public boolean add(T item) {
        boolean elementAdded = false;
        Node newNode = new Node(item);
        Node currentNode = head;
        int exceptions = 0;
        try {
            if (item == null && !areNullElementsAllowed) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        try {
            if (size >= maxSize) {
                exceptions++;
                throw new IllegalStateException();
            }
        } catch (IllegalStateException illegalStateException) {
            illegalStateException.printStackTrace();
        }
        if (exceptions == 0) {
            if (head == null) {
                head = newNode;
                elementAdded = true;
                size++;
            } else {
                while (currentNode.next != null)
                    currentNode = currentNode.next;
                currentNode.next = newNode;
                elementAdded = true;
                size++;
            }
        }
        return elementAdded;
    }

    public T element() {
        int exceptions = 0;
        T element = null;
        try {
            if (head == null) {
                exceptions++;
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException noSuchElementException) {
            noSuchElementException.printStackTrace();
        }
        if (exceptions == 0)
            element = head.item;
        return element;
    }

    public boolean offer(T item) {
        boolean isOffered = false;
        Node newNode = new Node(item);
        Node currentNode = head;
        int exceptions = 0;
        if (size >= maxSize)
            return false;
        else {
            try {
                if (item == null && !areNullElementsAllowed) {
                    exceptions++;
                    throw new NullPointerException();
                }
            } catch (NullPointerException nullPointerException) {
                nullPointerException.printStackTrace();
            }
            if (exceptions == 0) {
                if (head == null) {
                    head = newNode;
                    isOffered = true;
                    size++;
                } else {
                    while (currentNode.next != null)
                        currentNode = currentNode.next;
                    currentNode.next = newNode;
                    isOffered = true;
                    size++;
                }
            }
        }
        return isOffered;
    }

    public T poll() {
        T queueHead;
        if (size == 0)
            return null;
        else {
            queueHead = head.item;
            Node newHead = head.next;
            head = null;
            head = newHead;
            size--;
        }
        return queueHead;
    }

    public T remove() {
        T queueHead = null;
        int exception = 0;
        try {
            if (size == 0) {
                exception++;
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException noSuchElementException) {
            noSuchElementException.printStackTrace();
        }
        if (exception == 0) {
            queueHead = head.item;
            Node newHead = head.next;
            head = null;
            head = newHead;
            size--;
        }
        return queueHead;
    }

    public T peek() {
        T headOfQueue;
        if (size == 0)
            return null;
        else
            headOfQueue = head.item;
        return headOfQueue;
    }

    public boolean empty() {
        boolean isEmpty = false;
        if (size == 0)
            isEmpty = true;
        return isEmpty;
    }

    public String toString() {
        String queueOutput = "Your queue is: [ ";
        Node currentNode = head;
        if (head == null) {
            return "Queue is empty";
        } else {
            while (currentNode != null) {
                queueOutput += currentNode.item + " ";
                currentNode = currentNode.next;
            }
        }
        return queueOutput + ']';
    }

}
