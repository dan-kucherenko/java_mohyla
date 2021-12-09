import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.util.Scanner;

public class Kucherenko_G23 extends GraphicsProgram {
    private int middlePointWidth;
    private int middlePointHeight;

    public void run() {
        setSize(800, 600);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір квадрату:");
        int side = sc.nextInt();
        middlePointWidth = this.getWidth() / 2;
        middlePointHeight = this.getHeight() / 2;
        GRect rect = new GRect(middlePointWidth - side / 2, middlePointHeight - side / 2, side, side);
        rect.setFilled(false);
        GLine line_horizontal = new GLine(middlePointWidth - side, middlePointHeight, middlePointWidth + side, middlePointHeight);
        GLine line_vertical = new GLine(middlePointWidth, middlePointHeight - side, middlePointWidth, middlePointHeight + side);
        GLabel x = new GLabel("X", middlePointWidth + side / 8, middlePointHeight - side);
        GLabel y = new GLabel("Y", middlePointWidth + side, middlePointHeight - side / 8);
        add(rect);
        add(line_horizontal);
        add(line_vertical);
        add(x);
        add(y);

    }


}