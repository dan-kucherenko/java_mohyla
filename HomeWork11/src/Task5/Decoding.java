package Task5;

import java.io.*;
import java.util.Scanner;

public class Decoding {
    private static String readFile(String fileToDecode) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileToDecode));
        StringBuilder outputBuilder = new StringBuilder();
        String text;
        while ((text = br.readLine()) != null) {
            outputBuilder.append(text + '\n');
        }
        br.close();
        return outputBuilder.toString();
    }

    private static String decode(String data) {
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < data.length() - 1; i++) {
            char decodedChar = (char) (data.charAt(i) - 1);
            outputBuilder.append(decodedChar);
        }
        return outputBuilder.toString();
    }

    private static void writeDecodedFile(String output) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("src/Task5/decoded.txt"));
            pw.write(output);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву файла для декодування: ");
        String fileToDecode = "src/Task5/" + sc.nextLine();

        writeDecodedFile(decode(readFile(fileToDecode)));
    }
}
