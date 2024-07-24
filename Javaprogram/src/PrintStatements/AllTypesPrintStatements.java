package PrintStatements;

public class AllTypesPrintStatements {
    public static void main(String[] args) {
        //declare the variables with data types
        int myAge = 34;
        //size of long is greater than int
        long mySalary = 150000;
        //to store the Single Character Value
        char myGender = 'M';
        //to store any Text type value
        String myName = "Pawan Sharma";
        //to store the decimal value with larger size than float
        double bankInterest = 3.08565;
        //to store the decimal value
        float roi = 2.5F;
        //to store the true or false value
        boolean hasGF = false;

        //print all variable
        System.out.println("My age is : "+myAge);
        //empty println will print statement with new line
        System.out.println();
        System.out.println("My salary is : "+mySalary);
        // \n will use to add new line
        System.out.println("My gender is : "+myGender+"\n");
        //printf will print the statement with string formatter
        System.out.printf("My name is : '%S'", myName);
        System.out.println("My bank interest is : "+bankInterest);
        //print is used to only print any statement
        System.out.print("My bank roi is : "+roi);
        System.out.println("Do I have gf : "+ hasGF);
    }
}