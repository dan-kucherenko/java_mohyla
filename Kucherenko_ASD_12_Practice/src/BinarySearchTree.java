public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private int length;

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean contains(T element) {
        int exception = 0;
        try {
            if (element == null) {
                exception++;
                throw new NullPointerException();
            }
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        if (exception == 0)
            return containsRecursive(root, element);
        return false;
    }

    private boolean containsRecursive(TreeNode<T> nodeToStart, T element) {
        if (nodeToStart.data == element)
            return true;
        if (element.compareTo(nodeToStart.data) < 0 && nodeToStart.leftChild != null)
            return containsRecursive(nodeToStart.leftChild, element);
        if (element.compareTo(nodeToStart.data) > 0 && nodeToStart.rightChild != null)
            return containsRecursive(nodeToStart.rightChild, element);
        return false;
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
        if (exceptions == 0) {
            root = addRecursive(root, element);
            length++;
        }
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
