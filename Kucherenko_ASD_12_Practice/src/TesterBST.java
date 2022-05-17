import java.util.Locale;

public class TesterBST {
    public static void main(String[] args) {
        System.out.println("Testing default binary search tree:\n".toUpperCase(Locale.ROOT));
        BinarySearchTree<String> binarySearchTree = new BinarySearchTree<>();
        System.out.println("Your binary search tree is empty: " + binarySearchTree.isEmpty());
        binarySearchTree.add("Boris");
        binarySearchTree.add("Bork");
        binarySearchTree.add("Cane");
        binarySearchTree.add("Gale");
        binarySearchTree.add("Hablo");
        binarySearchTree.add("Eddie");
        binarySearchTree.add("Frank");
        binarySearchTree.add("Kevin");
        System.out.println(binarySearchTree);
        System.out.println("Your binary search tree is empty: " + binarySearchTree.isEmpty());
        System.out.println("Your binary search tree contains the inserted element: " +
                binarySearchTree.contains("Kevin"));

        System.out.println("\nTesting binary search tree with exceptions:\n".toUpperCase(Locale.ROOT));
        BinarySearchTree<Integer> binarySearchTreeWithExceptions = new BinarySearchTree<>();
        System.out.println("Your binary search tree is empty: " + binarySearchTreeWithExceptions.isEmpty());
        binarySearchTreeWithExceptions.add(null); //throws NUllPointerException
        System.out.println(binarySearchTreeWithExceptions);
        System.out.println("Your binary search tree is empty: " + binarySearchTreeWithExceptions.isEmpty());
        System.out.println("Your binary search tree contains the inserted element: " +
                binarySearchTreeWithExceptions.contains(null)); //throws NUllPointerException

    }
}
