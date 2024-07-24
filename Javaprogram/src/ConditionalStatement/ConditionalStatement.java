package ConditionalStatement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        //check the user is valid for ride vehicles
        System.out.println("Enter user age: ");
        Scanner scanner=new Scanner(System.in);
        int myAge = scanner.nextInt();
        if (myAge > 18){
            System.out.println("You'r valid for ride vehicles");
        }
        else {
            System.out.println("You'r not valid for ride vehicles");
        }
    }
}