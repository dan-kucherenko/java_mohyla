import java.util.Locale;

public class BinaryTreeTester {
    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree(1);
        binaryTree.addRightChild(1, 2);
        binaryTree.addLeftChild(1, 3);
        binaryTree.addRightChild(2, 5);
        binaryTree.addLeftChild(2, 4);
        binaryTree.addLeftChild(5,9);
        binaryTree.addRightChild(5,8);
//        binaryTree.addLeftChild(5,4);
        System.out.println("Testing default binary tree:\n".toUpperCase(Locale.ROOT));
        System.out.println("Your binary tree looks like: " + binaryTree);
//        System.out.println("Your binary tree is empty: " + binaryTree.isEmpty());
//        System.out.println("Number of vertices of the binary tree is: " + binaryTree.getLength());
//        System.out.println("Your binary tree contains the inserted element: " + binaryTree.contains(3));
        binaryTree.delete(3);
        System.out.println("Your binary tree looks like: " + binaryTree);

//        TreeNode node4 = new TreeNode(null);
//        TreeNode node5 = new TreeNode(2);
//        TreeNode node6 = new TreeNode(6);
//        System.out.println("\n\nTesting binary tree with exceptions: \n\n");
//        BinaryTree<TreeNode> binaryTreeExceptions = new BinaryTree<>(node4); //throws NullPointerException
//        binaryTreeExceptions.addLeftChild(node5, node6); //throws NoSuchElementExpression
//        binaryTreeExceptions.delete(node4); //throws NoSuchElementExpression
//        binaryTree.addLeftChild(node1, node6); //throws IllegalArgumentExpression
    }
}
