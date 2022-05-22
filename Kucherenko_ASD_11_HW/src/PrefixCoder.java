public class PrefixCoder {
    public String encode(String data, Dictionary dictionary) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : data.toCharArray())
            stringBuilder.append(dictionary.findCharCode(ch));
        return stringBuilder.toString();
    }

    public String decode(String data, Dictionary dictionary) {
        StringBuilder result = new StringBuilder();
        PrefixNode<Character> root = dictionary.getRoot();
        while (!data.isEmpty()) {
            PrefixNode<Character> currentNode = root;
            for (char ch : data.toCharArray()) {
                if (ch == '0')
                    currentNode = currentNode.leftChild;
                if (ch == '1')
                    currentNode = currentNode.rightChild;
                data = data.substring(1);
                if (currentNode.leftChild == null && currentNode.rightChild == null) {
                    result.append(currentNode.data);
                    break;
                }
            }
        }
        return result.toString();
    }
}
