import java.util.Scanner;

public class HanoiTowers {
    public static int numberOfActions;

    public static void main(String[] args) {
        int temporary = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int numberOfDisks = sc1.nextInt(); //number of disks

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the tower number:");
        int end = sc2.nextInt(); //number of towers = the last tower's number

        Towers(numberOfDisks, 1, end);
        System.out.println("Number of actions: " + numberOfActions);
    }

    public static void moveDisk(int start, int end) {
        System.out.println("Move disk from " + start + " tower to " + end + " tower");
        numberOfActions++;
    }

    public static void Towers(int numberOfDisks, int start, int end) {
        if (numberOfDisks == 1) moveDisk(start, end);
        else {
            int temporary = 6 - end - start;
            Towers(numberOfDisks - 1, start, temporary);
            moveDisk(start, end);
            Towers(numberOfDisks - 1, temporary, end);

        }
    }
}
