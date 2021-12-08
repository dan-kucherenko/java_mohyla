package Task2;

import java.io.*;
import java.util.Scanner;

public class CopyTextToFile {
    private static void copyTextToFile(String fileToCopy, String fileToCopyIn) {

        String newFile = fileToCopyIn.replace(".txt", ".bak");
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileToCopy));
            PrintWriter pw = new PrintWriter(new FileWriter(newFile));

            String text;
            while ((text = br.readLine()) != null) {
                pw.write(text + '\n');
            }
            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть файл з якого читаємо текст: ");
        String fileToCopy = "src/Task2/" + sc.nextLine();

        System.out.print("Введіть файл куди записуємо: ");
        String fileToCopyIn = "src/Task2/" + sc.nextLine();

        copyTextToFile(fileToCopy, fileToCopyIn);
    }
}



