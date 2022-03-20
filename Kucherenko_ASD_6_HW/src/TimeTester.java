import java.io.FileWriter;
import java.io.PrintWriter;

public class TimeTester {
    public static PrintWriter printWriter;

    public static void main(String[] args) {
        try {
            printWriter = new PrintWriter(new FileWriter("timeTester.txt"));
            CreateAndCalculate cac = new CreateAndCalculate();

            printWriter.println("Random arrays:\n");
            cac.createRandomArrays();   //calculate algorithm time execution for arrays with random numbers
            cac.calculateTimeForAllAlgorithms();

            printWriter.println("\nSorted arrays:\n");
            cac.createSortedArrays();   //calculate algorithm time execution for sorted arrays
            cac.calculateTimeForAllAlgorithms();

            printWriter.println("\nReverse sorted arrays:\n");
            cac.createReverseSortedArray();   //calculate algorithm time execution for reverse sorted arrays
            cac.calculateTimeForAllAlgorithms();

            printWriter.println("\nArrays with the same element:\n");
            cac.createArraysWithSameElement();  //calculate algorithm time execution for arrays with same numbers
            cac.calculateTimeForAllAlgorithms();

            printWriter.close();

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }}