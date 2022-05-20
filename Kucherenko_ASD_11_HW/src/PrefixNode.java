public class PrefixNode<T> {
    T data;
    char decodedChar;
    PrefixNode<T> leftChild;
    PrefixNode<T> rightChild;
    PrefixNode<T> parent;

    public PrefixNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }
}
