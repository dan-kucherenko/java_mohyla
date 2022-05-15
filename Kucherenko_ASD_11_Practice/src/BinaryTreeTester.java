public class BinaryTreeTester {
    public static void main(String[] args) {
        TreeNode root = new TreeNode<>(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(4);

        BinaryTree<TreeNode> binaryTree = new BinaryTree<>(root);

        System.out.println("Testing default binary tree:\n");
        binaryTree.addRightChild(binaryTree.root, node1);
        binaryTree.addLeftChild(binaryTree.root, node2);
        binaryTree.addLeftChild(node1, node3);
        System.out.println("Your binary tree looks like: \n" + binaryTree + '\n');
        System.out.println("Your binary tree is empty: " + binaryTree.isEmpty());
        System.out.println("Number of vertices of the binary tree is: " + binaryTree.getLength());
//        System.out.println(binaryTree.contains(node1));
//        binaryTree.delete(node3);

        TreeNode node4 = new TreeNode(null);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(6);
        System.out.println("\n\nTesting binary tree with exceptions: \n\n");
        BinaryTree<TreeNode> binaryTreeExceptions = new BinaryTree<>(node4); //throws NullPointerException
        binaryTreeExceptions.addLeftChild(node5, node6); //throws NoSuchElementExpression
        binaryTreeExceptions.delete(node4); //throws NoSuchElementExpression
        binaryTree.addLeftChild(node1, node6); //throws IllegalArgumentExpression
    }
}
