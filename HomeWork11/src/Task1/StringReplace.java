package Task1;

import java.io.*;
import java.util.Scanner;

public class StringReplace {
    private static void inputingAndReplacingData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву файлу з якого читаємо: ");
        String fileToReadName = "src/Task1/" + sc.nextLine();

        System.out.print("Введіть строку для заміни: ");
        String stringToReplace = sc.nextLine();

        System.out.print("Введіть строку на яку замінюємо обрану: ");
        String stringToReplaceWith = sc.nextLine();
        replaceString(fileToReadName, stringToReplace, stringToReplaceWith);
    }

    private static void replaceString(String fileToReadName, String stringToReplace, String stringToReplaceWith) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileToReadName));
            StringBuilder outputStringBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                String formattedL = line.replaceAll(stringToReplace, stringToReplaceWith);
                outputStringBuilder.append(formattedL + '\n');
            }
            String output = outputStringBuilder.toString();
            PrintWriter pw = new PrintWriter(new FileWriter(fileToReadName));
            pw.print(output);
            br.close();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        inputingAndReplacingData();
    }
}
