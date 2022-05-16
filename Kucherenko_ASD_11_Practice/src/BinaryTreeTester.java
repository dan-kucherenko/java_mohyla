import java.util.Locale;

public class BinaryTreeTester {
    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree(1);
        binaryTree.addRightChild(1, 2);
        binaryTree.addLeftChild(1, 3);
        binaryTree.addRightChild(3, 5);
        binaryTree.addLeftChild(3, 4);
        binaryTree.addLeftChild(5,9);
        System.out.println("Testing default binary tree:\n".toUpperCase(Locale.ROOT));
        System.out.println("Your binary tree looks like: " + binaryTree);
        System.out.println("Your binary tree is empty: " + binaryTree.isEmpty());
        System.out.println("Number of vertices of the binary tree is: " + binaryTree.getLength());
        System.out.println("Your binary tree contains the inserted element: " + binaryTree.contains(3));
        binaryTree.delete(3);
        System.out.println("Your binary tree looks like: " + binaryTree);

        System.out.println("\n\nTesting binary tree with exceptions: \n\n".toUpperCase(Locale.ROOT));
        BinaryTree<Integer> binaryTreeExceptions = new BinaryTree<>(null); //throws NullPointerException
        BinaryTree<Integer> binaryTreeExceptions2 = new BinaryTree<>(2);
        binaryTreeExceptions.contains(null); //throws NullPointerException
        binaryTreeExceptions.addLeftChild(1, 3); //throws NoSuchElementExpression
        binaryTreeExceptions2.addLeftChild(2, 3);
        binaryTreeExceptions2.addLeftChild(2, null); //throws NullPointerExpression
        binaryTreeExceptions2.addLeftChild(2,4); //throws IllegalArgumentExpression
        //The same exceptions work with addRightChild method
        binaryTreeExceptions.delete(6); //throw NoSuchElementExpression
        binaryTreeExceptions.delete(null); //throw NullPointerExpression

    }
}
