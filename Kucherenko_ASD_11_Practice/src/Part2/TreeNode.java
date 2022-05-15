package Part2;

public class TreeNode<T> {
    public T data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
