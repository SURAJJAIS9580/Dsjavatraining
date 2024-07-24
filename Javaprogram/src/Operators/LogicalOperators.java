package Operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        //find the greatest no among three 3no
        System.out.println("Enter the no of a , b, c");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //to check which no is greatest we have to use if else with logical operators
        if (a > b && a > c)
        {
            System.out.println("the greatest no is a "+ a);
        } else if (b > a && b > c) {
            System.out.println("the greatest no is b "+ b);
        }else {
            System.out.println("the greatest no is c "+ c);
        }
    }
}