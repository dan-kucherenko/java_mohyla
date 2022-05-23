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

    private PrefixNode<T> findNodeFromEl(PrefixNode<T> nodeToStart, T valueToSearchFor) {
        if (nodeToStart == null)
            return null;
        if (nodeToStart.data == valueToSearchFor)
            return nodeToStart;
        else {
            if (nodeToStart.leftChild != null)
                return findNodeFromEl(nodeToStart.leftChild, valueToSearchFor);
            else
                nodeToStart = nodeToStart.parent;
            if (nodeToStart.rightChild != null)
                return findNodeFromEl(nodeToStart.rightChild, valueToSearchFor);
        }
        return nodeToStart;
    }
}