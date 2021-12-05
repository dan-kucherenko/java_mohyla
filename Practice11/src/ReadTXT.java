import acm.program.ConsoleProgram;
import acm.util.ErrorException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTXT {
    private static BufferedReader myReader() {
        BufferedReader rd = null;
        while (rd == null) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Введіть назву файлу з якого будемо читати інформацію: ");
                String name = sc.nextLine();
                rd = new BufferedReader(new FileReader(name));
            } catch (FileNotFoundException e) {
                System.out.println("Файл не знайдено");
            }

        }
        return rd;
    }

    public static void main(String[] args) {
        BufferedReader myR = myReader();
        try {
            while (true) {
                String s;
                s = myR.readLine();
                if (s == null) break;
                System.out.println(s);
            }
            myR.close();
        } catch (IOException e) {
            throw new ErrorException(e);
        }
    }

}