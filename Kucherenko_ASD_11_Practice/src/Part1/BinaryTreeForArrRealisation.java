package Part1;

import Part2.BinaryTree;

public class BinaryTreeForArrRealisation<T> {
    private T[] arr;
    private Node root;
    private int length;
    class Node {
        T data;
        Node left, right;
        Node(T data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTreeForArrRealisation(int arrLength) {
        this.length = arrLength;
        arr = (T[]) new Object[arrLength];
    }

    public void setRoot(T root) {
        this.root.data = root;
        arr[0] = root;
        length++;
    }


    public void addLeftChild(int root, T key) {
        int leafIndex = (root * 2) + 1;
        if (arr[root] == null)
            System.out.println("There is no parent for this child");
        else
            arr[leafIndex] = key;
        length++;
    }

    public void addRightChild(int root, T key) {
        int leafIndex = (root * 2) + 2;
        if (arr[root] == null)
            System.out.println("There is no parent for this child");
        else
            arr[leafIndex] = key;
        length++;
    }

//    public boolean hasLeftChild() {
//        return arr[2 * (int) root + 1] != null;
//    }
//
//    public boolean hasRightChild() {
//        return arr[2 * (int) root + 2] != null;
//    }

//    @Override
//    public String toString() {
//        T currentNode = root;
//        String res = "";
//        while ((hasLeftChild() || hasRightChild())) {
//            res += "(" + currentNode + "(" + currentNode. ")";
//            currentNode = currentNode.left;
//        }
//        return res;
//    }
}
