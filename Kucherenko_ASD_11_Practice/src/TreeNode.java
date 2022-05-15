public class TreeNode<T> {
    T data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
