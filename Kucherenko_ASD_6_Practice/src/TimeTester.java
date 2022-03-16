import java.io.FileWriter;
import java.io.PrintWriter;

public class TimeTester {

    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("timeTester.txt"));
            CreatingArrays ca = new CreatingArrays();
            CalculatingTime ct = new CalculatingTime();

            printWriter.println("Random arrays:\n");
            ca.createRandomArrays();   //calculate algorithm time execution for arrays with random numbers
            ct.calculateTimeForAllAlgorithms();

            printWriter.println("\nSorted arrays:\n");
            ca.createSortedArrays();   //calculate algorithm time execution for sorted arrays
            ct.calculateTimeForAllAlgorithms();

            printWriter.println("\nReverse sorted arrays:\n");
            ca.createReverseSortedArray();   //calculate algorithm time execution for reverse sorted arrays
            ct.calculateTimeForAllAlgorithms();

            printWriter.println("\nArrays with the same element:\n");
            ca.createArraysWithSameElement();  //calculate algorithm time execution for arrays with same numbers
            ct.calculateTimeForAllAlgorithms();

            printWriter.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
