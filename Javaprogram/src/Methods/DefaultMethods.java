package Methods;

import java.util.Scanner;

public class DefaultMethods {
    public static void main(String[] args) {
        //create one method to find the area of rectangle
        //call the method with name areaRectangle alt + enter shortcut create method
        //methods is used for code reusability and code optimization
        areaRectangle();
    }

    private static void areaRectangle() {
        System.out.println("Enter the length and width of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.println("Area of rectangle is " + (length * width));
    }
}