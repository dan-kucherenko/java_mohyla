public class BinaryTreeForArrRealisation<T> {
    private T[] arr;
    private T root;
    private int length;

    public BinaryTreeForArrRealisation(int arrLength) {
//        this.length = arrLength;
        arr = (T[]) new Object[arrLength];
    }

    public void setRoot(T root) {
        this.root = root;
        arr[0] = root;
    }


    public void setLeft(T key, int root) {
        int leafIndex = (root * 2) + 1;
        if (arr[root] == null)
            System.out.println("There is no parent for this child");
        else
            arr[leafIndex] = key;
    }

    public void setRight(T key, int root) {
        int leafIndex = (root * 2) + 2;
        if (arr[root] == null)
            System.out.println("There is no parent for this child");
        else
            arr[leafIndex] = key;
    }

    public void printTheBinaryTree() {
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("/\\");
            System.out.println(arr[root + 1]);

            System.out.print("-");
        }
    }
}
