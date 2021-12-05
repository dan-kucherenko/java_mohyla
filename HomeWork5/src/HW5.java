import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class HW5 extends GraphicsProgram {
    byte tableWidth = 8;
    byte tableHeight = 8;
    boolean colour = true;
    final byte rect_size = 50;

    public void run() {
        for (byte x = 0; x < tableWidth; x++) {
            if ((tableHeight % 2 == 0) || (tableWidth % 2 == 0)) {
                colour = !colour;
            }
            for (byte y = 0; y < tableHeight; y++) {
                int x_position = x * 50;
                int y_position = y * 50;

                GRect rect = new GRect(x_position, y_position, rect_size, rect_size);
                rect.setFilled(true);

                if (colour) {
                    rect.setFillColor(Color.BLACK);
                } else {
                    rect.setFillColor(Color.WHITE);
                }
                add(rect);
                colour = !colour;
            }


        }
    }
}

