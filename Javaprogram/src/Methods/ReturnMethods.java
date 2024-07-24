package Methods;

import java.util.Scanner;

public class ReturnMethods {
    public static void main(String[] args) {
        //return method will return the output
        //find the area of rectangle
        System.out.println("Enter the width and length of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        //call the method for area finding in rectangle using above width length
        int areaRectangleReturn =areaRectangleArguments(length, width);
        System.out.println("The area of rectangle is: "+ areaRectangleReturn);

    }

    private static int areaRectangleArguments(int length, int width) {
        return (length*width);
    }
}