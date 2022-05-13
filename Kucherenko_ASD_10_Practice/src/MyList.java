public class MyList<T extends Number & Comparable<T>> {
    private Node head;
    public int length;
    public MyList() {
        head = null;
    }

    class Node {
        private T data;
        private Node next;
        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
            length++;
        } else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            length++;
        }

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
