package Part1;

import java.util.Scanner;

public class BinaryTreeFromArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to get a binary tree from: ");
        int length = sc.nextInt();
        BinaryTreeForArrRealisation<String> obj = new BinaryTreeForArrRealisation<>(length);
        obj.setRoot("A");
        //    obj.set_Left("B", 0);
        obj.addLeftChild(0, "C");
        obj.addRightChild(0, "D");
        obj.addLeftChild(1, "E");
        obj.addRightChild(2, "F");
        obj.printTheBinaryTree();
    }
}
