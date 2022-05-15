package Part2;
public class BinaryTreeTester {
    public static void main(String[] args) {
        TreeNode root = new TreeNode<>(1);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);

        BinaryTree<TreeNode> binaryTree = new BinaryTree<>(root);

        System.out.println("Testing default binary tree: \n\n");
        binaryTree.addRightChild(binaryTree.root, node1);
        binaryTree.addLeftChild(binaryTree.root, node2);
        binaryTree.addLeftChild(node1, node3);
        System.out.println("Your binary tree looks like: \n" + binaryTree + '\n');
        System.out.println("Your binary tree is empty: " + binaryTree.isEmpty());
        System.out.println("Number of vertices of the binary tree is: " + binaryTree.getLength());
//        System.out.println(binaryTree.contains(node1));
//        binaryTree.delete(node3);

        TreeNode node4 = new TreeNode(null);
        BinaryTree<TreeNode> binaryTreeNullPointer = new BinaryTree<>(node4);
        System.out.println("Testing binary tree with exceptions: \n\n");

    }
}
