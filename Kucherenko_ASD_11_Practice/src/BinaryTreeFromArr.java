public class BinaryTreeFromArr {
    public static void main(String[] args) {
        BinaryTreeForArrRealisation<Integer> binaryTree = new BinaryTreeForArrRealisation<>();
        binaryTree.setRoot(1);
        binaryTree.addRightChild(1, 3);
        binaryTree.addLeftChild(1, 4);
        binaryTree.addLeftChild(3, 5);
        binaryTree.addRightChild(4, 9);
        System.out.println("Your array implementation of binary tree: " + binaryTree);
    }
}
