import java.awt.*;
import java.awt.event.InputEvent;

public class LeftMouseClick {
    private Robot robot;

    public LeftMouseClick(){
        try{
            robot = new Robot();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Click(){
        try{
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(150);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(150);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
