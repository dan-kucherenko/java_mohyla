import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class RobotFace extends GraphicsProgram {
    public void run() {
        final int HEAD_WIDTH = 200;
        final int HEAD_HEIGHT = 350;
        final int EYE_RADIUS = 40;
        final int MOUTH_WIDTH = 130;
        final int MOUTH_HEIGHT = 50;

        GRect robotHead = new GRect(250, 50, HEAD_WIDTH, HEAD_HEIGHT);
        robotHead.setFilled(true);
        robotHead.setColor(Color.GRAY);
        add(robotHead);

        GRect robotMouth = new GRect(285,300,MOUTH_WIDTH,MOUTH_HEIGHT);
        robotMouth.setFilled(true);
        robotMouth.setColor(Color.WHITE);
        add(robotMouth);

        GOval robotEyes_1 = new GOval(280, 120, EYE_RADIUS,40);
        robotEyes_1.setFilled(true);
        robotEyes_1.setColor(Color.YELLOW);
        add(robotEyes_1);

        GOval robotEyes_2 = new GOval(380, 120, EYE_RADIUS,40);
        robotEyes_2.setFilled(true);
        robotEyes_2.setColor(Color.YELLOW);
        add(robotEyes_2);
    }
}

