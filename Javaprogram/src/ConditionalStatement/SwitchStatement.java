package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //switch statement is replacement of multi if else
        System.out.println("Enter your car speed: ");
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        switch (speed)
        {
            case 120:
                System.out.println("You are in speed please drive slow");
                break;
            case 30:
                System.out.println("You'r speed too slow on highway drive on 80");
                break;
            case 80:
                System.out.println("Enjoy the road and highway and maintain your speed");
                break;
            default:
                System.out.println("You are good rider safe ride");
        }
    }
}