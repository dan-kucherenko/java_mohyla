import com.sun.source.tree.Tree;

public class TreeNode<T> {
    T data;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;
    TreeNode<T> parent;

    public TreeNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }
}
