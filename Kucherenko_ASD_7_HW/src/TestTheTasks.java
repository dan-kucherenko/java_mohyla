import java.util.ArrayList;
import java.util.Arrays;

public class TestTheTasks {
    public static void main(String[] args) {
        ActionsWithFile raf = new ActionsWithFile();

        ArrayList<String> linesOfFile = raf.readAFile(); //task 1
//        raf.writeToFile(linesOfFile);
//        raf.containsString(linesOfFile);
//        raf.indexOfLinesThatContain(linesOfFile);
//        raf.sortFile();

        System.out.println(Arrays.toString(raf.indexOfLinesThatContain(linesOfFile)));

    }
}
