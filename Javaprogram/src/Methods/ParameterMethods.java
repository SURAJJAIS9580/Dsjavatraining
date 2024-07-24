package Methods;

import java.util.Scanner;

public class ParameterMethods {
    public static void main(String[] args) {
        //parameter or arguments methods have some parameter in method calling
        //find the area of rectangle
        System.out.println("Enter the width and length of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        //call the method for area finding in rectangle using above width length
        areaRectangleArguments(length, width);
    }

    private static void areaRectangleArguments(int length, int width) {
        System.out.println("The area of rectangle is: "+ (length*width));
    }
}