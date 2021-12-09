package Task5;

import java.io.*;
import java.util.Scanner;

public class Decoding {
    private static void writeDecodedFile(String fileToDecode) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileToDecode));
            StringBuilder outputBuilderForReading = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                outputBuilderForReading.append(text + '\n');
            }
            br.close();
            String outputToDecode = outputBuilderForReading.toString();
            StringBuilder outputBuilderToWrite = new StringBuilder();
            for (int i = 0; i < outputToDecode.length() - 1; i++) {
                char encodedChar = (char) (outputToDecode.charAt(i) - 1);
                outputBuilderToWrite.append(encodedChar);
            }
            String output = outputBuilderToWrite.toString();
            PrintWriter pw = new PrintWriter(new FileWriter("src/Task5/decoded.txt"));
            pw.write(output);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву файла для декодування: ");
        String fileToEncrypt = "src/Task5/" + sc.nextLine();

        writeDecodedFile(fileToEncrypt);
    }
}
