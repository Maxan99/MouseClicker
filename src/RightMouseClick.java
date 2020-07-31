import java.awt.*;
import java.awt.event.InputEvent;

public class RightMouseClick {
    private Robot robot;

    public RightMouseClick(){
        try{
            robot = new Robot();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Click(){
        try {
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            Thread.sleep(150);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            Thread.sleep(150);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
