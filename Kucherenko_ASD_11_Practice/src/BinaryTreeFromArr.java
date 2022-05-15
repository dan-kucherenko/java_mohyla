import java.util.Scanner;

public class BinaryTreeFromArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to get a binary tree from: ");
        int length = sc.nextInt();
        BinaryTreeForArrRealisation<String> binaryTree = new BinaryTreeForArrRealisation<>(length);
        binaryTree.setRoot("A");
        //    obj.set_Left("B", 0);
        binaryTree.addRightChild(0, "D");
        binaryTree.addLeftChild(0, "C");
        binaryTree.addLeftChild(1, "E");
        binaryTree.addRightChild(1, "F");
        System.out.println(binaryTree.toString());
    }
}
