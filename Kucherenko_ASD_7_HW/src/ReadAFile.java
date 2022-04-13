import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAFile {
    ArrayList<String> readAFile() {
        ArrayList<String> linesOfFile = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/fileToRead.txt"));
            String text;
            while ((text = br.readLine()) != null)
                linesOfFile.add(text);
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return linesOfFile;
    }

    void writeToFile(ArrayList<String> linesOfFile) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("files/fileToRead.txt"));
            String line;
            for (int i = 0; i < linesOfFile.size(); i++) {
                line = linesOfFile.get(i);
                pw.println(line);
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    boolean containsString(String str, ArrayList<String> linesOfFile) {
        boolean contains = false;
        Scanner sc = new Scanner(System.in);
        String lineToFind = sc.nextLine();
        for (int i = 0; i < linesOfFile.size(); i++) {
            if (lineToFind.equals(linesOfFile.get(i))) {
                System.out.println("Your file contain the string you have written!");
                contains = true;
            } else
                System.out.println("Your file doesn't contain the string you have written!");
        }
        return contains;
    }
}
