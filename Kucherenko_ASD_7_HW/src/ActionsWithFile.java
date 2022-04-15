import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
        System.out.print("Enter the string you want to find: ");
        String lineToFind = sc.nextLine();
        for (int i = 0; i < linesOfFile.size(); i++) {
            if (lineToFind.equals(linesOfFile.get(i)))
                contains = true;
        }
        if (contains)
            System.out.println("Yes, your file contains a string you have written \n");
        else
            System.out.println("Your file doesn't contain a string you have written \n");

        return contains;
    }

    int[] indexOfLinesThatContain(ArrayList<String> linesOfFile) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the SUBstring you want to find: ");
        String substringToFind = sc.nextLine();
        ArrayList<Integer> linesIndexes = new ArrayList<>();
        for (int i = 0; i < linesOfFile.size(); i++) {
            if (linesOfFile.get(i).contains(substringToFind))
                linesIndexes.add(linesOfFile.indexOf(linesOfFile.get(i)));
        }
        int[] linesIndexesAsArray = new int[linesIndexes.size()];
        for (int i = 0; i < linesIndexes.size(); i++)
            linesIndexesAsArray[i] = linesIndexes.get(i) + 1;
        return linesIndexesAsArray;
    }

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

    void swapTheLines() {
        try {
            PrintWriter pwForSwapping = new PrintWriter(new FileWriter("files/copyWithSwapping"));
            Scanner sc = new Scanner(System.in);
            String fileNameToRead, line_A, line_B, text;
            System.out.print("Enter the name of the file to read: ");
            fileNameToRead = "files/" + sc.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(fileNameToRead));
            System.out.print("Enter the first line to swap: ");
            line_A = sc.nextLine();
            System.out.print("Enter the second line to swap: ");
            line_B = sc.nextLine();

            LinkedList<String> linesOfFileToSwap = new LinkedList<>();
            while ((text = br.readLine()) != null)
                linesOfFileToSwap.add(text);
            if (!linesOfFileToSwap.contains(line_A) || !linesOfFileToSwap.contains(line_B)) {
                System.out.println("Error in strings you inserted \n");
                System.exit(1);
            }
            linesOfFileToSwap.set(linesOfFileToSwap.indexOf(line_B), line_A);
            linesOfFileToSwap.set(linesOfFileToSwap.indexOf(line_A), line_B);
            for (int i = 0; i < linesOfFileToSwap.size(); i++)
                pwForSwapping.write(linesOfFileToSwap.get(i) + '\n');
            pwForSwapping.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }


}
