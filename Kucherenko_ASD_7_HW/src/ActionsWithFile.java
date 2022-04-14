import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ActionsWithFile {
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
            PrintWriter pw = new PrintWriter(new FileWriter("files/fileToWriteIn.txt"));
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

    boolean containsString(ArrayList<String> linesOfFile) {
        boolean contains = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to find");
        String lineToFind = sc.nextLine();
        for (int i = 0; i < linesOfFile.size(); i++) {
            if (lineToFind.equals(linesOfFile.get(i)))
                contains = true;
        }
        return contains;
    }

    int[] allPlacesOfContains() {
        int[] allPlaces = new int[0];
        return allPlaces;
    }

//    class CompareLines implements Comparable<CompareLines> {
//        String s1;
//
//        public CompareLines(String s1, String s2) {
//            this.s1 = s1;
//        }
//
//        @Override
//        public int compareTo(CompareLines that) {
//            int i = 0;
//            while (this.s1.charAt(i) - that.s1.charAt(i) == 0) {
//                i++;
//                return this.s1.charAt(i) - that.s1.charAt(i);
//            }
//            return this.s1.charAt(i) - that.s1.charAt(i);
//        }
//    }

    void sortFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/name.txt"));
            ArrayList<String> linesToSort = new ArrayList<>();
            String text;
            while ((text = br.readLine()) != null)
                linesToSort.add(text);
            PrintWriter pwForAsc = new PrintWriter(new FileWriter("files/name_asc.txt"));
            PrintWriter pwForDesc = new PrintWriter(new FileWriter("files/name_desc.txt"));
            Collections.sort(linesToSort);
            for (int i = 0; i < linesToSort.size(); i++)
                pwForAsc.write(linesToSort.get(i) + '\n');
            pwForAsc.close();
            Collections.sort(linesToSort, Collections.reverseOrder());
            for (int i = 0; i < linesToSort.size(); i++)
                pwForDesc.write(linesToSort.get(i) + '\n');
            pwForDesc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }


}
