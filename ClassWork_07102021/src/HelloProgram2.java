import acm.graphics.GLabel;
import acm.program.*;
import java.awt.Color;

public class HelloProgram2 extends GraphicsProgram {
    public void run() {
        GLabel label = new GLabel("Hello World", 100, 75);
        label.setFont("SansSerif-90");
        label.setColor(Color.red);
        add(label);
    }
}
