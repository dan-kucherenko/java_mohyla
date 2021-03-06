public class MyList<T extends Number & Comparable<T>> {
    private Node head;
    public int length;

    public MyList() {
        head = null;
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
            length++;
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
            if (data == i.data) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }

    public void clear() {
        for (Node i = head; i != null; i = i.next) {
            remove(i.data);
        }
    }

    public String toString() {
        Node currentNode = head;
        String listAsString = "Your list is: [";
        sort();
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

    public T get(int index) {
        Node currentNode = head;
        int count = 0;
        T numToFind = null;
        while (currentNode != null) {
            if (count == index) {
                numToFind = currentNode.data;
                return numToFind;
            }
            count++;
            currentNode = currentNode.next;
        }
        assert (false);
        return numToFind;
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

