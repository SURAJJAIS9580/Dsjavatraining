package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //print 10 natural no from 1 to 10 and find the sum
        int i = 1;
        int sum = 0;
        do {
            System.out.println(i);
            sum = sum + i;
            i++;
        }while (i <= 10);
        System.out.println("The sum is: "+sum);
    }
}