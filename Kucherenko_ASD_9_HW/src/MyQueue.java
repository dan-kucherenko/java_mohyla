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
        try {
            if (item == null && !areNullElementsAllowed)
                throw new NullPointerException();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        try {
            if (size > maxSize)
                throw new IllegalStateException();
        } catch (IllegalStateException illegalStateException) {
            illegalStateException.printStackTrace();
        }
        if (head == null) {
            head = newNode;
            size++;
        }
        else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
        return elementAdded;
    }

}
