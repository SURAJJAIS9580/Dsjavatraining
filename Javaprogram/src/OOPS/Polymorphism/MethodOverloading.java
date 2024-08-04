
package OOPS.Polymorphism;

//total memory
public class MethodOverloading {
    public static void main(String[] args) {
       // method calling for addition integer
       int result= add(5,6);   //4+12=16
        //method calling for addition float
       double resultValue=add(20.5, 9.3);  //8+24=32
        System.out.println("m1"+result + "m2"+resultValue);
    }

    private static double add(double v, double v1) {
        double value=v+v1;
        return value;
    }

    private static int add(int i, int i1) {
        int a=i+i1;
        return a;
    }

}