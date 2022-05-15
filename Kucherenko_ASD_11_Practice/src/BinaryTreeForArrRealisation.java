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
        TreeNode rootNode = new TreeNode(root);
        this.root = rootNode;
        length++;
    }


    public void addLeftChild(int rootIndex, T key) {
        int leafIndex = (rootIndex * 2) + 1;
        if (arr[rootIndex] == null)
            System.out.println("There is no parent for this child");
        else {
            arr[leafIndex] = key;
            TreeNode leftChild = new TreeNode(key);
            this.root.leftChild = leftChild;
            length++;
        }
    }

    public void addRightChild(int rootIndex, T key) {
        int leafIndex = (rootIndex * 2) + 2;
        if (arr[rootIndex] == null)
            System.out.println("There is no parent for this child");
        else {
            arr[leafIndex] = key;
            TreeNode rightChild = new TreeNode(key);
            this.root.rightChild = rightChild;
            length++;
        }
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
