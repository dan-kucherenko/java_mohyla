public class MyList<T extends Number & Comparable<T>> {
    public Node head;
    public Node tail;
    public int length;

    public MyList() {
        head = null;
        tail = null;
    }

    class Node {
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
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            length++;
        }

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
        Node currentNode = head;
        String listAsString = "Your list is: [ ";
        if (head == null) {
            return "List is empty";
        } else {
            while (currentNode != null) {
                listAsString += currentNode.data + " ";
                currentNode = currentNode.next;
            }
        }
        return listAsString + ']';
    }

    public void push(T new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void sort() {
        Node currentNode = head;
        Node index;
        T temp;
        if (head == null)
            return;
        else {
            while (currentNode != null) {
                index = currentNode.next;
                while (index != null) {
                    if ((currentNode.data).compareTo(index.data) > 0) {
                        temp = currentNode.data;
                        currentNode.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                currentNode = currentNode.next;
            }
        }
    }
}

