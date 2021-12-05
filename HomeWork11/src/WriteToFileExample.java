import java.io.*;
import java.util.Scanner;

public class WriteToFileExample {
    private static String fileName;
    private static BufferedReader openFile() {
        BufferedReader rd = null;
        while (rd == null) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Введіть назву файлу з якого будемо брати інформацію: ");
                fileName = sc.nextLine();
                rd = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                System.out.println("Файл не знайдено");
            }
        }
        return rd;
    }

    public static void main(String[] args) {
        BufferedReader myReader = openFile();
        try {
            PrintWriter wr = new PrintWriter(new FileWriter(fileName));
            while (true) {
                String s;
                Scanner sc = new Scanner(System.in);
                System.out.println("Введіть строку, яку запишемо у файл: ");
                s = sc.nextLine();
                if (s.equals("")) break;
                System.out.println(s);
                wr.println(s);
            }
            myReader.close();
            wr.close();
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
