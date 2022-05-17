import java.util.NoSuchElementException;

public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private int length;

    public BinarySearchTree() {
        root = null;
    }

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
        String res = toStringRecursive(root);
        return "(" + res + ")";
    }

    public T remove(T element) {
        int exceptions = 0;
        try {
            if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (!contains(element)) {
                exceptions++;
                throw new NoSuchElementException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            removeRecursive(root, element);
            return element;
        }
        return null;
    }

    public MyList<T> getElementsAsc() {
        MyList<T> result = new MyList<>();
        getElementAscRecursive(root, result);
        return result;
    }

    public MyList<T> getElementsDesc() {
        MyList<T> result = new MyList<>();
        getElementDescRecursive(root, result);
        return result;
    }

    private void getElementAscRecursive(TreeNode<T> nodeToStart, MyList<T> resultList) {
        if (nodeToStart != null) {
            getElementAscRecursive(nodeToStart.leftChild, resultList);
            resultList.add(nodeToStart.data);
            getElementAscRecursive(nodeToStart.rightChild, resultList);
        }
    }

    private void getElementDescRecursive(TreeNode<T> nodeToStart, MyList<T> resultList) {
        if (nodeToStart != null) {
            getElementDescRecursive(nodeToStart.rightChild, resultList);
            resultList.add(nodeToStart.data);
            getElementDescRecursive(nodeToStart.leftChild, resultList);
        }
    }

    private TreeNode<T> removeRecursive(TreeNode<T> nodeToStart, T element) {
        if (element.compareTo(nodeToStart.data) < 0)
            return nodeToStart.leftChild = removeRecursive(nodeToStart.leftChild, element);
        else if (element.compareTo(nodeToStart.data) > 0)
            return nodeToStart.rightChild = removeRecursive(nodeToStart.rightChild, element);
        else {
            if (nodeToStart.leftChild == null)
                return nodeToStart.rightChild;
            else if (nodeToStart.rightChild == null)
                return nodeToStart.leftChild;
            nodeToStart.data = minValue(nodeToStart.rightChild);
            nodeToStart.rightChild = removeRecursive(nodeToStart.rightChild, nodeToStart.data);
        }
        return nodeToStart;
    }

    private T minValue(TreeNode<T> nodeToStart) {
        T minValue = nodeToStart.data;
        while (nodeToStart.leftChild != null) {
            minValue = nodeToStart.leftChild.data;
            nodeToStart = nodeToStart.leftChild;
        }
        return minValue;
    }

    private boolean containsRecursive(TreeNode<T> nodeToStart, T element) {
        if (nodeToStart.data == element)
            return true;
        else if (element.compareTo(nodeToStart.data) < 0 && nodeToStart.leftChild != null)
            return containsRecursive(nodeToStart.leftChild, element);
        else if (element.compareTo(nodeToStart.data) > 0 && nodeToStart.rightChild != null)
            return containsRecursive(nodeToStart.rightChild, element);
        return false;
    }

    private String toStringRecursive(TreeNode<T> root) {
        String res = "";
        if (root == null || root.data == null)
            return res += "*"; // * is used for empty child
        if (root.leftChild == null && root.rightChild == null)
            return res += root.data;
        return root.data.toString() + "(" + toStringRecursive(root.leftChild) + "," +
                toStringRecursive(root.rightChild) + ")";
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
