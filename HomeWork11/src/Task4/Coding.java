package Task4;

import java.io.*;
import java.util.Scanner;

public class Coding {
    private static String readFile(String fileToEncrypt) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileToEncrypt));
        StringBuilder outputBuilder = new StringBuilder();
        String text;
        while ((text = br.readLine()) != null) {
            outputBuilder.append(text + '\n');
        }
        br.close();
        return outputBuilder.toString();
    }

    private static String encode(String data) {
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < data.length() - 1; i++) {
            char encodedChar = (char) (data.charAt(i) + 1);
            outputBuilder.append(encodedChar);
        }
        return outputBuilder.toString();
    }

    private static void writeEncodedFile(String output) {
        try {
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

        writeEncodedFile(encode(readFile(fileToEncrypt)));
    }
}
