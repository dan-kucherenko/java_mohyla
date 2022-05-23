public class PrefixCodingTester {
    public static void main(String[] args) {
        PrefixCoder coder = new PrefixCoder();
        Dictionary dictionary = new Dictionary();
        dictionary.addCharWithCode('a', "000");
        dictionary.addCharWithCode('b', "001");
        dictionary.addCharWithCode('c', "010");
        dictionary.addCharWithCode('d', "011");
        dictionary.addCharWithCode('e', "100");
        String stringToEncode = "abcde";
        System.out.println("Source string: " + stringToEncode);
        String encodedString = coder.encode(stringToEncode, dictionary);
        System.out.println("Encoded string: " + encodedString);
        String decodedEncodedString = coder.decode(encodedString, dictionary);
        System.out.println("Decoded string: " + decodedEncodedString);
    }
}