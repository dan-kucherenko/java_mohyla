public class MyList<T extends Number & Comparable<T>> {
    private Node head;
    private Node tail;
    public int length;


    public MyList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    class Node {
        private T data;
        private Node next;
        private Node previous;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        length++;
    }

    @Override
    public String toString() {
        Node currentNode = head;
        String listAsString = "{";
        if (head == null)
            return "List is empty";
        else {
            while (currentNode != null) {
                listAsString += currentNode.data;
                if (currentNode.next != null)
                    listAsString += ", ";
                currentNode = currentNode.next;
            }
        }
        return listAsString + '}';
    }
}
