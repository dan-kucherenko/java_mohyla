import java.util.NoSuchElementException;

public class BinaryTree<T> {
    TreeNode<T> root;
    private int length;

    public BinaryTree(T rootValue) {
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

    public int getLength() {
        return length;
    }

    public boolean contains(T valueToSearchFor) {
        int exceptions = 0;
        boolean isPresent = false;
        try {
            if (valueToSearchFor == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        if (exceptions == 0)
            isPresent = containsRecursive(root, valueToSearchFor);
        return isPresent;
    }

    public void addLeftChild(T elementToAdd, T element) {
        int exceptions = 0;
        TreeNode<T> nodeOfElementToAdd = findNodeFromEl(root, elementToAdd);
        try {
            if (!contains(elementToAdd)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (nodeOfElementToAdd.leftChild != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            nodeOfElementToAdd.leftChild = new TreeNode<T>(element);
            length++;
        }
    }

    public void addRightChild(T elementToAdd, T element) {
        int exceptions = 0;
        TreeNode<T> nodeOfElementToAdd = findNodeFromEl(root, elementToAdd);
        try {
            if (!contains(elementToAdd)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (nodeOfElementToAdd.rightChild != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            nodeOfElementToAdd.rightChild = new TreeNode<T>(element);
            length++;
        }
    }

    public void delete(T element) {
        int exceptions = 0;
        TreeNode rootNode = new TreeNode(root);
        try {
            if (!contains(element)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            TreeNode nodeToDelete = new TreeNode(element);
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

    private boolean containsRecursive(TreeNode<T> nodeToStartWith, T valueToSearchFor) {
        if (nodeToStartWith.data == valueToSearchFor)
            return true;
        if (valueToSearchFor == null)
            return false;
        else {
            if (nodeToStartWith.leftChild != null)
                return containsRecursive(nodeToStartWith.leftChild, valueToSearchFor);
            if (nodeToStartWith.rightChild != null)
                return containsRecursive(nodeToStartWith.rightChild, valueToSearchFor);
        }
        return false;
    }

    private TreeNode<T> findNodeFromEl(TreeNode<T> nodeToStart, T valueToSearchFor) {
        if (nodeToStart == null || nodeToStart == null)
            return null;
        if (nodeToStart.data == valueToSearchFor)
            return nodeToStart;
        else {
            if (nodeToStart.leftChild != null)
                return findNodeFromEl(nodeToStart.leftChild, valueToSearchFor);
            if (nodeToStart.rightChild != null)
                return findNodeFromEl(nodeToStart.rightChild, valueToSearchFor);
        }
        return nodeToStart;
    }
}