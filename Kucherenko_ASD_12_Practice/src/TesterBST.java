public class TesterBST {
    public static void main(String[] args) {
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
    }
}
