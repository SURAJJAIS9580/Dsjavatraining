package TypeCasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        //to convert one data type to another data type
        //e.g petrol pump salesperson charge in int rupees
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your petrol exact charges ");
        float exactPetrolCharges = scanner.nextFloat();
        //convert float to int to pay in rupees
        int paidPetrolCharges = (int) exactPetrolCharges;
        System.out.println("Paid amount is : "+ paidPetrolCharges);
    }
}