package Part2;

public class BinaryTreeTester {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(1);
        binaryTree.addLeftChild(binaryTree.root, 3);
        binaryTree.addRightChild(binaryTree.root,5);
        System.out.println(binaryTree);
    }
}
