public class TesterBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree(8);
        binarySearchTree.add(3);
        binarySearchTree.add(10);
        binarySearchTree.add(1);
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(13);
        System.out.println(binarySearchTree);
//        BinarySearchTree<String> binarySearchTree = new BinarySearchTree<>("Boris");
//        binarySearchTree.add("Bork");
//        binarySearchTree.add("Cane");
//        binarySearchTree.add("Gale");
//        binarySearchTree.add("Hablo");
//        binarySearchTree.add("Eddie");
//        binarySearchTree.add("Frank");
//        binarySearchTree.add("Kevin");
//        System.out.println(binarySearchTree);
        System.out.println("Your binary search tree is empty: " + binarySearchTree.isEmpty());
        System.out.println("Your binary search tree contains the inserted element: "+ binarySearchTree.contains(2));
    }
}
