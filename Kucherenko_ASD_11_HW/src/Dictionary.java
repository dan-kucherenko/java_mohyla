public class Dictionary extends BinaryTree<Character> {
    public String findCharCode(Character character) {
        return findCharCodeFrom(character, getRoot());
    }

    private void addCharWithCode(Character character, String code) { //make root
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

    private String findCharCodeFrom(Character character, PrefixNode<Character> node) {
        if (node.rightChild == null && node.leftChild == null) {
            if (character == node.data)
                return "";
            return null;
        }
        if (node.leftChild != null) {
            String res = findCharCodeFrom(character, node.leftChild);
            if (res != null) {
                if (res.equals("")) {
                    return "0";
                }
                return "0" + res;
            }
        }
        if (node.rightChild != null) {
            String res = findCharCodeFrom(character, node.rightChild);
            if (res != null) {
                if (res.equals("")) {
                    return "1";
                }
                return "1" + res;
            }
        }
        return null;
    }

    private void createDictionary() {
        addCharWithCode('a', "000");
        addCharWithCode('b', "001");
        addCharWithCode('c', "010");
        addCharWithCode('d', "011");
        addCharWithCode('e', "100");
    }

    public Dictionary() {
        setRoot('\0');
        createDictionary();
    }
}
