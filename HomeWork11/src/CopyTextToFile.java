import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyTextToFile {
    private static void fileReading(String fileName) throws FileNotFoundException {
       File file = new File(fileName);
       Scanner sc = new Scanner(fileName);
       StringBuilder outputStringBuilder = new StringBuilder();
       while(sc.hasNextLine()){
           String line = sc.nextLine();
           outputStringBuilder.append(line+"\n");
       }
       String output = outputStringBuilder.toString();
       // copyTextToFile(fileToCopy, output);
       }

    private static void copyTextToFile(String fileToCopy, String output) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву файлу з якого копіюємо текст: ");
        String fileName = sc.nextLine();
        File inputFile = new File(fileName);

        System.out.print("Введіть файл в який будемо копіювати текст: ");
        String fileToCopyName = sc.nextLine();
        File fileToCopyText = new File(fileToCopyName);
    }
}



