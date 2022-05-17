public class TesterBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        System.out.println("Your binary search tree is empty: " + binarySearchTree.isEmpty());
        binarySearchTree.add(45);
        binarySearchTree.add(10);
        binarySearchTree.add(90);
        binarySearchTree.add(7);
        binarySearchTree.add(12);
        binarySearchTree.add(4);
        binarySearchTree.add(14);
        binarySearchTree.add(13);
        System.out.println(binarySearchTree);
        System.out.println("Your binary search tree is empty: " + binarySearchTree.isEmpty());
        System.out.println("Your binary search tree contains the inserted element: " + binarySearchTree.contains(3));
        System.out.println("Deleted element is: "+ binarySearchTree.remove(10));
        System.out.println(binarySearchTree);
    }
}
