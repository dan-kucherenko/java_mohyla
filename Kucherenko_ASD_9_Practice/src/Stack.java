import java.util.EmptyStackException;

public class Stack<T extends Number> {
    private Node peek;
    private Node bottom;
    public int size;

    public Stack() {
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

    public T pop() throws EmptyStackException {
        Node currentNode = bottom;
        Node poppedElement = null;
        Node prevNode = null;
        if (size == 0)
            throw new EmptyStackException();
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

    public T peek() throws EmptyStackException {
        Node currentNode = bottom;
        if (size == 0)
            throw new EmptyStackException();
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                peek = currentNode;
            }
        }
        return peek.item;
    }

    public boolean empty() {
        boolean isEmpty = false;
        if (size == 0)
            isEmpty = true;
        return isEmpty;
    }

    public int search(T element) {
        int indexOfElement = 0;
        Node currentNode = bottom;
        while (currentNode != null) {
            if ((currentNode.item).equals(element))
                return indexOfElement;
            if (currentNode.item != element)
               return -1;
            if (bottom.item.equals(element))
                return 1;
            currentNode = currentNode.next;
            indexOfElement++;
        }
        return indexOfElement;
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
