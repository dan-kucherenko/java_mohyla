import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
    // Weight (lb) / Height (in) ^2 * 703
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height feet: ");
        int heightFeet = input.nextInt();

        System.out.print("Enter height inches: ");
        int heightInches = input.nextInt();

        int totalHeightInInches = (heightFeet * 12) + heightInches;
        input.close();

        double bmi = weight / Math.pow(totalHeightInInches, 2) * 703;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is: " + df.format(bmi));

    }
}

