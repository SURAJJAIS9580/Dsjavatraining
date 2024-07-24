package Operators;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        //it is a replacement of if else and its one line code
        //find the user is eligible for voting or not based on their age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int myAge = scanner.nextInt();
        //to check the user age is greater than 17 or not
        //syntax for ternary operator ?:
        // e.g. condition ? "Statement 1 condition true" : "Statement 2 condition false";
        String voteStatus = (myAge >= 18) ? "Eligible for vote" : "Not eligible for vote";
        System.out.println("User is "+ voteStatus);
    }
}