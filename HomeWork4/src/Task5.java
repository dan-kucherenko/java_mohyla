import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the number of the day: ");
        Scanner sc = new Scanner(System.in);
        byte dayNum = sc.nextByte();
        switch (dayNum) {
            case 0:
                System.out.println("It's Sunday!");
                break;
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
        }
    }
}
