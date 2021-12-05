import java.io.*;
import java.util.Scanner;

public class StringReplace {
    private static void replaceString(File file, String string, String replacingString) throws IOException {
        Scanner sc = new Scanner(file);
        StringBuilder outputStringBuilder = new StringBuilder();
        String formattedLine = null;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            formattedLine = line.replaceAll(string, replacingString);
            outputStringBuilder.append(formattedLine).append('\n');
        }
        String outputString = outputStringBuilder.toString();
        fileWriting(file, outputString);
    }

    private static void fileWriting(File file, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.write(data);
        pw.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть файл для запису: ");
        String fileName = sc.nextLine();

        System.out.print("Введіть строку для заміни: ");
        String string = sc.nextLine();

        System.out.print("Введіть строку для заміни обраної строки: ");
        String replacingString = sc.nextLine();

        File inputFile = new File(fileName);
        try {
            replaceString(inputFile, string, replacingString);

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.exit(1);
        }
    }

}
