import java.util.Locale;

public class TesterBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(10);
        binarySearchTree.add(1);
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(13);
        System.out.println(binarySearchTree);
        System.out.println("Your binary search tree is empty: " + binarySearchTree.isEmpty());
        System.out.println("Your binary search tree contains the inserted element: " + binarySearchTree.contains(3));
        System.out.println("Deleted element is: "+ binarySearchTree.remove(2));
        System.out.println(binarySearchTree);
    }
}
