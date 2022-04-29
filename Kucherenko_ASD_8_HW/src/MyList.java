import java.util.Arrays;

public class MyList<T extends Number> {
    private Node head;
    private int length;
//    private Node cursor;

    public MyList() {
        head = null;
    }

    private class Node {
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null)
            head = newNode;
        else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
        }
        length++;
    }

    public void remove(T data) {
        Node currentNode = head;
        Node prevNode = null;
        while (currentNode != null) {
            if (currentNode.data == data) {
                if (currentNode == head)
                    head = currentNode.next;
                else
                    prevNode.next = currentNode.next;
                length--;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public boolean find(T data) {
        boolean isExists = false;
        for (Node i = head; i != null; i = i.next) {
            if (data.equals(i)) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }

    public String toString() {
        Object[] elements = new Object[length];
        int iterator = 0;
        for (Node node = head; node != null; node = node.next)
                elements[iterator++] = node.data;
        return "Your list is: " + Arrays.toString(elements);
    }
}

