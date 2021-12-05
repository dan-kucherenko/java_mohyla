import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of the day: ");
        Scanner sc = new Scanner(System.in);
        byte seasonNum = sc.nextByte();
        switch (seasonNum) {
            case 1:
                System.out.println("It's Winter!");
                break;
            case 2:
                System.out.println("It's Spring!");
                break;
            case 3:
                System.out.println("It's Summer!");
                break;
            case 4:
                System.out.println("It's Autumn!");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
