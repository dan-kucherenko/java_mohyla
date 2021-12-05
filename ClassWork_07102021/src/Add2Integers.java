import acm.program.*;
public class Add2Integers extends DialogProgram {
    public void run(){
        println("This program adds two numbers");
        double n1 = readDouble("enter n1:");
        double n2 = readDouble("enter n2:");
        double total1=n1+n2;
        println("Сума дорівнює "+ total1+ ".");


    }
}
