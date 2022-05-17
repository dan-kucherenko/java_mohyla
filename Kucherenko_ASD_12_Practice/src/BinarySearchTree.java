public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private int length;

    public BinarySearchTree(T rootValue) {
        int exceptions = 0;
        try {
            if (rootValue == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            this.root = new TreeNode<>(rootValue);
            length++;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean contains(T element) {
        boolean isPresent = false;
        return isPresent;
    }

    public void add(T element) {
        int exceptions = 0;
        try {
            if (element == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        if (exceptions == 0)
            addRecursive(root, element);
    }

    public String toString() {
        String res = toString(root);
        return "(" + res + ")";
    }

    private String toString(TreeNode<T> root) {
        String res = "";
        if (root == null)
            return res += "*"; // * is used for empty child
        if (root.leftChild == null && root.rightChild == null)
            return res += root.data;
        return root.data.toString() + "(" + toString(root.leftChild) + "," + toString(root.rightChild) + ")";
    }

    private TreeNode<T> addRecursive(TreeNode<T> nodeToStart, T element) {
        if (nodeToStart == null)
            return new TreeNode<>(element);
        if (element.compareTo(nodeToStart.data) < 0)
            nodeToStart.leftChild = addRecursive(nodeToStart.leftChild, element);
        else
            nodeToStart.rightChild = addRecursive(nodeToStart.rightChild, element);
        return nodeToStart;
    }
}
