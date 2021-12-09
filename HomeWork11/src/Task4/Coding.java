package Task4;

import java.io.*;
import java.util.Scanner;

public class Coding {
    private static void writeEncodedFile(String fileToEncrypt) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileToEncrypt));
            StringBuilder outputBuilderForReading = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                outputBuilderForReading.append(text + '\n');
            }
            br.close();
            String outputToEncode = outputBuilderForReading.toString();
            StringBuilder outputBuilderToWrite = new StringBuilder();
            for (int i = 0; i < outputToEncode.length() - 1; i++) {
                char encodedChar = (char) (outputToEncode.charAt(i) + 1);
                outputBuilderToWrite.append(encodedChar);
            }
            String output = outputBuilderToWrite.toString();
            PrintWriter pw = new PrintWriter(new FileWriter("src/Task4/encoded.txt"));
            pw.write(output);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву файла для кодування: ");
        String fileToEncrypt = "src/Task4/" + sc.nextLine();

        writeEncodedFile(fileToEncrypt);
    }
}

