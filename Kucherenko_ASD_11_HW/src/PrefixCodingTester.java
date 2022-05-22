public class PrefixCodingTester {
    public static void main(String[] args) {
        PrefixCoder coder = new PrefixCoder();
        Dictionary dictionary = new Dictionary();
        String stringToEncode = "abc";
        System.out.println("Source string: " + stringToEncode);
        String encodedString = coder.encode(stringToEncode, dictionary);
        System.out.println("Encoded string: " + encodedString);
        String decodedEncodedString = coder.decode(encodedString, dictionary);
        System.out.println("Decoded string: " + decodedEncodedString);
    }
}