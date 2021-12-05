import java.io.*;
import java.util.Scanner;

public class StringReplace {
    private static void replaceString(File file, String string, String replacingString) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String formattedLine;

        }
    }

    private static void fileWriting(File file, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.write(data);
        pw.close();
    }

}
