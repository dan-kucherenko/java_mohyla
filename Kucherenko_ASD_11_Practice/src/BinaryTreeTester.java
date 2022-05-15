

public class BinaryTreeTester {
    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        BinaryTree node1 = new BinaryTree<>(root1);
        TreeNode node2 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        BinaryTree node3 = new BinaryTree(root2);
        node1.addRightChild(node2);
        node1.addLeftChild(node3);

//        BinaryTree node4 = new BinaryTree(node3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node3.addLeftChild(node5);
        node3.addRightChild(node6);

        System.out.println("Testing default binary tree:\n");

        System.out.println("Your binary tree looks like: \n" + node1 + '\n');
//        System.out.println("Your binary tree is empty: " + binaryTree.isEmpty());
//        System.out.println("Number of vertices of the binary tree is: " + binaryTree.getLength());
//        System.out.println(binaryTree.contains(3));
//        binaryTree.delete(node3);

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
