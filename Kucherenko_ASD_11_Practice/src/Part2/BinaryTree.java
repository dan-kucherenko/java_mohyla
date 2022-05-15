package Part2;

import com.sun.source.tree.Tree;

import java.util.NoSuchElementException;

public class BinaryTree<T> {
    private T data;
    public TreeNode root;
    private int length;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode parent;

    class TreeNode {
        private T data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T data) {
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
        if (exceptions == 0) {
            TreeNode root = new TreeNode(data);
            this.root = root;
            this.data = data;
        }
    }

//    public void addRoot(T data) {
//        TreeNode newNode = new TreeNode(data);
//        if (root == null)
//            root = newNode;
//        length++;
//    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getLength() {
        return length;
    }

    public boolean hasLeftChild() {
        return this.leftChild != null;
    }

    public boolean hasRightChild() {
        return this.rightChild != null;
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

    public void addLeftChild(TreeNode nodeToAdd, T element) {
        int exceptions = 0;
        try {
            if (!contains(nodeToAdd.data)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (nodeToAdd.left != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            TreeNode leftChildNode = new TreeNode(element);
            nodeToAdd.left = leftChildNode;
            length++;
//            leftChildNode. = nodeToAdd;
        }
    }

    public void addRightChild(TreeNode nodeToAdd, T element) {
        int exceptions = 0;
        try {
            if (!contains(nodeToAdd.data)) {
                exceptions++;
                throw new NoSuchElementException();
            } else if (element == null) {
                exceptions++;
                throw new NullPointerException();
            } else if (nodeToAdd.right != null) {
                exceptions++;
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exceptions == 0) {
            TreeNode rightChildNode = new TreeNode(element);
            nodeToAdd.right = rightChildNode;
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

    private String toString(TreeNode root) {
        String res = "";
        if (root == null)
            return "";
        res += root.data;
//        if (root.left == null && root.right == null)
//            return "";
        res += '(' + toString(root.left);
        if (root.right != null) {
            res += "," + toString(root.right);
            res += ')';
        }
        return res;
    }

    @Override
    public String toString() {
        String res = toString(root);
        return res ;
    }
}