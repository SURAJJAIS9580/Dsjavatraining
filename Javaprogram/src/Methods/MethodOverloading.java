package Methods;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter your today expense in Rupees");
        Scanner scanner = new Scanner(System.in);
        int expense = scanner.nextInt();
        System.out.println("Enter your Today earning");
        int earning = scanner.nextInt();

        System.out.println("Enter your today UPI expense");
        double expenseUPI = scanner.nextDouble();
        System.out.println("Enter your today UPI earning");
        double earningUPI = scanner.nextDouble();
        //create method and find the today UPI saving
        double savingUPI = todaySaving(earningUPI, expenseUPI);
        System.out.println("My UPI saving is: "+ savingUPI);
        //create method and find the today saving
        int saving = todaySaving(earning, expense);
        System.out.println("My saving is: "+ saving);
    }
    private static int todaySaving(int earning, int expense) {
        return (earning - expense);
    }
    private static double todaySaving(double earning, double expense) {
        return (earning - expense);
    }
}