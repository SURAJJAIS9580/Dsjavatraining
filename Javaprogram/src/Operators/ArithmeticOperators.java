package Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //arithmetic operator in java
        //add two no take the input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter b number: ");
        int b = scanner.nextInt();
        //for add two number we used + operator
        System.out.println("The sum is: "+(a+b));
        //for subtracting two number we used - operator
        System.out.println("The subtraction is: "+(a-b));
        //for multiplication two number we used * operator
        System.out.println("The multiplication is: "+(a*b));
        //for division two number we used / operator
        System.out.println("The division is: "+(a/b));
        //for modulus two number we used % operator
        System.out.println("The modulus is: "+(a%b));
    }
}