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

    public void addLeftChild(T element) {
        this.leftChild = (TreeNode) element;
    }

    public void addRightChild(T element) {
        this.rightChild = (TreeNode) element;
    }

}
