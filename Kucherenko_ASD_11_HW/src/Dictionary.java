public class Dictionary extends BinaryTree<Character> {
    public Dictionary() {
        setRoot('2');
    }
    public String findCharCode(Character character) {
        return findCharCodeRecursion(character, getRoot());
    }

    public void addCharWithCode(Character character, String code) {
        char[] chars = code.toCharArray();
        PrefixNode<Character> currentNode = getRoot();
        for (char ch : chars) {
            if (ch == '0') {
                if (currentNode.leftChild == null)
                    currentNode.leftChild = new PrefixNode<>(null);
                currentNode = currentNode.leftChild;
            } else if (ch == '1') {
                if (currentNode.rightChild == null)
                    currentNode.rightChild = new PrefixNode<>(null);
                currentNode = currentNode.rightChild;
            }
        }
        currentNode.data = character;
    }

    private String findCharCodeRecursion(Character character, PrefixNode<Character> node) {
        if (node.rightChild == null && node.leftChild == null) {
            if (character == node.data)
                return "";
            return null;
        }
        if (node.leftChild != null) {
            String res = findCharCodeRecursion(character, node.leftChild);
            if (res != null) {
                if (res.equals("")) {
                    return "0";
                }
                return "0" + res;
            }
        }
        if (node.rightChild != null) {
            String res = findCharCodeRecursion(character, node.rightChild);
            if (res != null) {
                if (res.equals("")) {
                    return "1";
                }
                return "1" + res;
            }
        }
        return null;
    }


}
