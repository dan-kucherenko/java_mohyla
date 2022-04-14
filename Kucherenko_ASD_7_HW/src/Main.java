import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ActionsWithFile raf = new ActionsWithFile();
        ArrayList<String> lines = raf.readAFile();
        raf.writeToFile(lines);
        System.out.println(raf.containsString(lines));
        raf.sortFile();

    }
}
