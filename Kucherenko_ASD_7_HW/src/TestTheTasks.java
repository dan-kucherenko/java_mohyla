import java.util.ArrayList;
import java.util.Arrays;

public class TestTheTasks {
    public static void main(String[] args) {
        ActionsWithFile raf = new ActionsWithFile();
        ArrayList<String> linesOfFile = raf.readAFile(); //task 1
        raf.writeToFile(linesOfFile); //task 2
        raf.containsString(linesOfFile); //task 3
        System.out.println(Arrays.toString(raf.indexOfLinesThatContain(linesOfFile))+'\n'); //task 4
        raf.sortFile(); //task 5
        raf.swapTheLines(); //task 6


    }
}
