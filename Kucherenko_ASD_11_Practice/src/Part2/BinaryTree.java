package Part2;

import java.util.NoSuchElementException;

public class BinaryTree<T> {
    public TreeNode root;
    private int length;
//    private TreeNode leftChild;
//    private TreeNode rightChild;
//    private TreeNode parent;

    public BinaryTree(TreeNode root) {
        int exceptions = 0;
        try {
            if (root == null) {
                exceptions++;
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            this.root = root;
            length++;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(T searchedValue) { //fix for binary tree
        boolean isPresent = true;
        TreeNode current = root;
        int exceptions = 0;
        try {
            if (current == null) {
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

    public void addLeftChild(TreeNode nodeToAdd, TreeNode element) {
        int exceptions = 0;
        try {
            if (!contains((T) nodeToAdd.data)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (nodeToAdd.leftChild != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            nodeToAdd.leftChild = element;
            length++;
        }
    }

    public void addRightChild(TreeNode nodeToAdd, TreeNode element) {
        int exceptions = 0;
        try {
            if (!contains((T) nodeToAdd.data)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (nodeToAdd.rightChild != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            nodeToAdd.rightChild = element;
            length++;
        }
    }

    public void delete(T element) {
        int exceptions = 0;
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

        }
    }

    @Override
    public String toString() {
        String res = toString(root);
        return "(" + res + ")";
    }

    private String toString(TreeNode parent) {
        String res = "";
        res += parent.data;
        if (parent.leftChild != null) {
            res += "(" + toString(parent.leftChild) + ",";
            if (parent.rightChild == null)
                res += "*)";
        }
        if (parent.rightChild != null) {
            if (parent.leftChild == null)
                res += "(*,";
            res += toString(parent.rightChild) + ")";
        }
        return res;
    }
}