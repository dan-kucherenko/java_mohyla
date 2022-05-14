package Part2;

import java.util.NoSuchElementException;

public class BinaryTree<T> {
    private T data;
    private Node root;
    private int length;
    private Node leftChild;
    private Node rightChild;
    private Node parent;

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
        if (exceptions == 0) {
            Node root = new Node(data);
            this.root = root;
            this.data = data;
        }
    }

    public void addRoot(T data) {
        Node newNode = new Node(data);
        if (root == null)
            root = newNode;
        length++;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(T searchedValue) { //fix for binary tree
        boolean isPresent = true;
        Node current = root;
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

    public void addLeftChild(Node nodeToAdd, T element) {
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
            Node leftChildNode = new Node(element);
            nodeToAdd.left = leftChildNode;
            length++;
//            leftChildNode. = nodeToAdd;
        }
    }

    public void addRightChild(Node nodeToAdd, T element) {
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
            Node rightChildNode = new Node(element);
            nodeToAdd.right = rightChildNode;
            length++;
        }
    }

    public void deleteLeaf(T element) {
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
        Node currentNode = root;
        String res = "";
//        while ((currentNode.left || currentNode.right) != null) {

//        }
        return res;
    }
}