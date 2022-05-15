public class TreeNode<T> {
    T data;
    TreeNode leftChild;
    TreeNode rightChild;
    TreeNode parent;

    public TreeNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

}
