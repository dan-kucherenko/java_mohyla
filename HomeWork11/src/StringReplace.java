import java.io.*;
import java.util.Scanner;

public class StringReplace {
    private static void replaceString(File file, String stringToBeReplaced, String stringToReplaceWith) throws IOException {
        Scanner sc = new Scanner(file);
        StringBuilder outputStringBuilder = new StringBuilder();
        String formattedLine = null;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            formattedLine = line.replace(stringToBeReplaced, stringToReplaceWith);
            outputStringBuilder.append(formattedLine + "\n");
        }
        String output = outputStringBuilder.toString();
        fileWriting(file, output);
    }

    private static void fileWriting(File file, String dataToWriteInFile) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.write(dataToWriteInFile);
        pw.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть файл для запису: ");
        String fileName = sc.nextLine();
        File inputFile = new File(fileName);

        System.out.print("Введіть строку для заміни: ");
        String stringToBeReplaced = sc.nextLine();

        System.out.print("Введіть строку на яку замінюємо обрану: ");
        String stringToReplaceWith = sc.nextLine();


        try {
            replaceString(inputFile, stringToBeReplaced, stringToReplaceWith);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
