import acm.graphics.GLabel;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
    public void run() {
        GLabel my_gl = new GLabel("Hello World", 500, 75);
        add(my_gl);
    }
}
