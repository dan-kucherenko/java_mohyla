import java.util.EmptyStackException;

public class MyStack<T extends Number> {
    private Node peek;
    private Node bottom;
    public int size;

    public MyStack() {
        peek = null;
        bottom = null;
    }

    class Node {
        public T item;
        public Node next;

        public Node(T data) {
            this.item = data;
            next = null;
        }
    }

    public T push(T item) {
        Node newNode = new Node(item);
        Node currentNode = bottom;
        if (bottom == null) {
            bottom = newNode;
            size++;
        } else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
        return item;
    }

    public T pop() {
        Node poppedElement;
        Node currentNode = bottom;
        int exceptions = 0;
        try {
            if (size == 0) {
                exceptions++;
                throw new EmptyStackException();
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            Node prevNode = null;
            while (currentNode.next != null) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            peek = prevNode;
            poppedElement = currentNode;
            peek.next = currentNode.next;
            size--;

            return poppedElement.item;
        }
        return null;
    }

    public T peek() {
        int exceptions = 0;
        Node currentNode = null;
        try {
            if (size == 0) {
                exceptions++;
                throw new EmptyStackException();
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            while (currentNode != null) {
                currentNode = currentNode.next;
                peek = currentNode;
            }
            return peek.item;
        }
        return null;
    }

    public boolean empty() {
        boolean isEmpty = false;
        if (size == 0)
            isEmpty = true;
        return isEmpty;
    }

    public int search(T element) {
        int indexOfElement = 1;
        Node currentNode = bottom;
        while (currentNode != null) {
            if ((currentNode.item).equals(element))
                return indexOfElement;
            if (bottom.item.equals(element))
                return 1;
            currentNode = currentNode.next;
            indexOfElement++;
        }
        return -1;
    }

    public String toString() {
        String stackOutput = "Your stack is: [ ";
        Node currentNode = bottom;
        if (bottom == null) {
            return "Stack is empty";
        } else {
            while (currentNode != null) {
                stackOutput += currentNode.item + " ";
                currentNode = currentNode.next;
            }
        }
        return stackOutput + ']';
    }
}
