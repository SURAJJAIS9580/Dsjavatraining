package ConditionalStatement;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        //indian students only applied for govt job whose age 24 to 30
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your nationality: ");
        String nationality = scanner.nextLine();
        System.out.println("Enter your age: ");
        int myAge = scanner.nextInt();
        if (nationality.equals("indian"))
        {
            if (myAge >= 24 && myAge <=30 )
            {
                System.out.println("You'r eligible for this job");
            }
            else{
                System.out.println("You'r age not match");
            }
        }
        else {
            System.out.println("You'r not eligible for this job");
        }
    }
}