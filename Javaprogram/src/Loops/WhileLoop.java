package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        //print 10 natural no in descending order 1 to 10 and find the sum
        int i = 10;
        int sum = 0;
        while(i >= 1)
        {
            System.out.println(i);
            sum = sum + i;
            i--;
        }
        System.out.println("The sum is "+sum);
    }
}