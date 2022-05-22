public class BinaryTree<T> {
    private PrefixNode<T> root;
    public BinaryTree() {
    }

    public void setRoot(T data) {
        this.root = new PrefixNode<>(data);
    }

    public PrefixNode<T> getRoot() {
        return this.root;
    }
}