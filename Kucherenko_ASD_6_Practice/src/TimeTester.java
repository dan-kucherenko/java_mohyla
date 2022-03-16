import java.io.FileWriter;
import java.io.PrintWriter;

public class TimeTester {
    public static PrintWriter printWriter;

    public static void main(String[] args) {
        try {
            printWriter = new PrintWriter(new FileWriter("timeTester.txt"));
            CreateAndCalculate ct = new CreateAndCalculate();

            printWriter.println("Random arrays:\n");
            ct.createRandomArrays();   //calculate algorithm time execution for arrays with random numbers
            ct.calculateTimeForAllAlgorithms();

            printWriter.println("\nSorted arrays:\n");
            ct.createSortedArrays();   //calculate algorithm time execution for sorted arrays
            ct.calculateTimeForAllAlgorithms();

            printWriter.println("\nReverse sorted arrays:\n");
            ct.createReverseSortedArray();   //calculate algorithm time execution for reverse sorted arrays
            ct.calculateTimeForAllAlgorithms();

            printWriter.println("\nArrays with the same element:\n");
            ct.createArraysWithSameElement();  //calculate algorithm time execution for arrays with same numbers
            ct.calculateTimeForAllAlgorithms();

            printWriter.close();

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
