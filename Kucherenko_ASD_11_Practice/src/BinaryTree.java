import java.util.NoSuchElementException;

public class BinaryTree<T> {
    private TreeNode root;
    private int length;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode parent;

    public BinaryTree(TreeNode root) {
        int exceptions = 0;
        try {
            if (root.data == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            if (root instanceof TreeNode<?>) {
                this.root = new TreeNode(((TreeNode<?>) root).data);
            } else {
                this.root = new TreeNode(root);
//            }
            length++;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(T searchedValue) { //fix for binary tree
        int exceptions = 0;
        boolean isPresent = false;
        try {
            if (searchedValue == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        if (exceptions == 0) {
        }
        return isPresent;
    }

    public void addLeftChild(T element) {
        int exceptions = 0;
//        TreeNode elementToAddNode = findNodeFromEl(elementToAdd);
        try {
//            if (!contains(elementToAdd)) {
//                exceptions++;
//                throw new NoSuchElementException();
//            } else
            if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (root.leftChild != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            root.leftChild = (TreeNode) element;
            length++;
        }
    }

    public void addRightChild(T element) {
        int exceptions = 0;
//        TreeNode elementToAddNode = findNodeFromEl(elementToAdd);
        try {
//            if (!contains(elementToAdd)) {
//                exceptions++;
//                throw new NoSuchElementException();
//            } else
            if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (root.rightChild != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            root.rightChild = (TreeNode) element;
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

    private String toString(TreeNode root) {
        String res = "";
        res += root.data;
        if (root.leftChild != null) {
            res += "(" + toString(root.leftChild) + ",";
            if (root.rightChild == null)
                res += "*)";
        }
        if (root.rightChild != null) {
            if (root.leftChild == null)
                res += "(*,";
            res += toString(root.rightChild) + ")";
        }
        return res;
    }
}