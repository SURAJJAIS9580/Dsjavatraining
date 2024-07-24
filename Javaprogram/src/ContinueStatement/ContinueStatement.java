package ContinueStatement;

public class ContinueStatement {
    public static void main(String[] args) {
        //it will skip the current iteration
        //e.g. print 10 natural no but 4 & 7 should not print
        for (int i = 1; i < 10; i++) {
            if (i == 4 || i == 7)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}