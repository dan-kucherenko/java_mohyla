import java.util.Scanner;

public class DeleteSymbol {
    public static String removeAllOccurences(String str, String orig, String repl) {
        int index = str.indexOf(orig);
        if (index != -1) {
            str = str.substring(0, index) + repl + str.substring(index + orig.length());
        }
        return str;
    }
}
