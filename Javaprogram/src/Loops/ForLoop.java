package Loops;

public class ForLoop {
    public static void main(String[] args) {
        //print the 10 natural no 1 to 10 and find the sum also
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            sum +=i;
        }
        System.out.println("The sum is: "+sum);
    }
}