import acm.program.ConsoleProgram;

import java.util.ArrayList;

public class FindRange extends ConsoleProgram {
    public String number;

    public void run() {
        println("This program finds the largest and smallest numbers");
        ArrayList<String> num = new ArrayList<>();
        int counter = 0;
        do {
            print("? ");
            number = readLine();
            num.add(number);
            counter++;
            int smallest = Integer.parseInt(num.get(0));
            int largest = Integer.parseInt(num.get(0));
            if (number.equals("stop")) {
                if (Integer.parseInt(num.get(0)) == 0) {
                    println("No numbers were typed in");
                } else if (Integer.parseInt(num.get(1)) == 0) {
                    println("Number " + (num.get(counter - 2)) + " is the only one in the list, so it's the largest and the smallest");
                } else {
                    for (int i = 0; i < num.size(); i++) {
                        if (i < smallest)
                            smallest = i;
                        if (i > largest)
                            largest = i;
                    }
                    println("Largest number is: " + largest);
                    println("Smallest number is: " + smallest);
                }
            }
        } while (number != "stop");
    }
}