package Task3;

import java.io.*;
import java.util.Scanner;

public class OddEvenNum {
    private static final String oddFileName = "src/Task3/oddNums.txt";
    private static final String evenFileName = "src/Task3/evenNums.txt";

    private static void oddEven() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Введіть назву файлу з якого читаємо: ");
            String readerFileName = "src/Task3/" + sc.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader(readerFileName));
            PrintWriter oddFIleWriter = new PrintWriter(new FileWriter(oddFileName));
            PrintWriter evenFileWriter = new PrintWriter(new FileWriter(evenFileName));

            boolean isOdd = true;
            String line;
            while ((line = reader.readLine()) != null) {
                if (isOdd) {
                    oddFIleWriter.print(line + '\n');
                    isOdd = false;
                } else {
                    evenFileWriter.print(line + '\n');
                    isOdd = true;
                }
            }
            reader.close();
            oddFIleWriter.close();
            evenFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        oddEven();
    }
}
