import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class TimeTester {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[20];
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = r.nextInt(10);
            numbers[i] = randomNum;
        }
        System.out.println("Ваш масив до сортування: " + Arrays.toString(numbers));
        Sorter s = new Sorter();
        Stopwatch sw = new Stopwatch();
        PrintWriter bw = new PrintWriter(new FileWriter("timeTester.txt"));
        double res = sw.elapsedTime();
        s.bubbleSort(numbers);
        bw.println("Hi!");
        System.out.println("Ваш масив після сортування: " + Arrays.toString(numbers));
    }
}
