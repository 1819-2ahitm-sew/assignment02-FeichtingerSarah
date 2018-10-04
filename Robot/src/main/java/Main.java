import at.htl.robot.model.Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Do something with the robot
        String eingabe;
        Robot robot = new Robot();
        System.out.println("x = " + robot.getX());
        System.out.println("y = " + robot.getY());
        System.out.println("Direction = " + robot.getDirection());
        System.out.println();


        while (true)
        {
            System.out.print("Was soll der Roboter jetzt machen? (Step forward = S, rotate Left = L)");
            eingabe = scanner.nextLine();

            if((eingabe.toUpperCase()).equals("S"))
            {
                robot.stepForward();
            }
            else if((eingabe.toUpperCase()).equals("L"))
            {
                robot.rotateLeft();
            }

            System.out.println("x = " + robot.getX());
            System.out.println("y = " + robot.getY());
            System.out.println("Direction = " + robot.getDirection());
            System.out.println();
        }
    }



}
