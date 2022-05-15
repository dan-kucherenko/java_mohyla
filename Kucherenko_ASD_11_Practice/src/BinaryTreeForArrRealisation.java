public class BinaryTreeForArrRealisation<T> {
    private T[] arr;
    private TreeNode root;
    private int length;

    public BinaryTreeForArrRealisation(int arrLength) {
        this.length = arrLength;
        arr = (T[]) new Object[arrLength];
    }

    public void setRoot(T root) {
        arr[0] = root;
        length++;
    }


    public void addLeftChild(int root, T key) {
        int leafIndex = (root * 2) + 1;
        if (arr[root] == null)
            System.out.println("There is no parent for this child");
        else
            arr[leafIndex] = key;
        length++;
    }

    public void addRightChild(int root, T key) {
        int leafIndex = (root * 2) + 2;
        if (arr[root] == null)
            System.out.println("There is no parent for this child");
        else
            arr[leafIndex] = key;
        length++;
    }

    @Override
    public String toString() {
        String res = toString(root);
        return "(" + res + ")";
    }

    private String toString(TreeNode parent) {
        String res = "";
        res += parent.data;
        if (parent.leftChild != null) {
            res += "(" + toString(parent.leftChild) + ",";
            if (parent.rightChild == null)
                res += "*)";
        }
        if (parent.rightChild != null) {
            if (parent.leftChild == null)
                res += "(*,";
            res += toString(parent.rightChild) + ")";
        }
        return res;
    }
}
