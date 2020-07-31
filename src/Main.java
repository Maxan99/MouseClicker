import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a console based DSO(Drakensang Online) tool. \n " +
                "Thought, it can be used as a Left/Right mouse buttons auto-clicker.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of clicks.");
        int clicks = Integer.parseInt(sc.nextLine());

        System.out.println("Choose between the following commands: (1 = Left mouse click), (2 = Right Mouse Click)");
        String command = sc.nextLine();

        RightMouseClick RMC = new RightMouseClick();
        LeftMouseClick LMC = new LeftMouseClick();

        while (!command.equals("Stop")) {
            if (command.equals("1")) {
                System.out.println("Process will start after 3 seconds.");
                StartDelay();
                for (int i = 0; i < clicks; i++) {
                    LMC.Click();
                }
            }
            if(command.equals("2")){
                System.out.println("Process will start after 3 seconds.");
                StartDelay();
                for (int i = 0; i < clicks; i++) {
                    RMC.Click();
                }
            }

            command = sc.nextLine();
        }
    }
    public static void StartDelay(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
