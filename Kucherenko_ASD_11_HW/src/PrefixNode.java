public class PrefixNode<T> {
    T data;
    PrefixNode<T> leftChild;
    PrefixNode<T> rightChild;

    public PrefixNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
