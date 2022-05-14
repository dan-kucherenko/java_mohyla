package Part2;

public class BinaryTree<T> {
    private T data;
    private Node root;
    private int length;
    private Node leftChild;
    private Node rightChild;

    class Node {
        private T data;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree(T data) {
        int exceptions = 0;
        try {
            if (data == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        if (exceptions == 0)
            this.data = data;
    }

    public Node addNode(Node node, T data) {
        if (node == null)
            return new Node(data);
        if ((double) data < (double) node.data)
            node.left = addNode(node.left, data);
        else if ((double) data > (double) node.data)
            node.right = addNode(node.right, data);
        return node;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(Node currentNode, T element) {
        int exceptions = 0;
        try {
            if (element == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        if (exceptions == 0) {
            if (element == currentNode.data)
                return true;
            if (currentNode == null)
                return false;
        }
        return (double) data < (double) currentNode.data
                ? contains(currentNode.left, element)
                : contains(currentNode.right, element);
    }

}
