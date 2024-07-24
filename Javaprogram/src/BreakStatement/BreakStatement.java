package BreakStatement;

public class BreakStatement {
    public static void main(String[] args) {
        //it will stop the loop or iteration
        //e.g. print 10 natural no but loop should after print 6
        for (int i = 1; i <=10 ; i++) {
            if (i == 7)
            {
                break;
            }
            System.out.println(i);
        }
    }
}