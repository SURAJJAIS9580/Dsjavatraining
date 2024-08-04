package OOPS.Inheritance;

public class MyInheritance {
    public static void main(String[] args) {
        Calc calc=new Calc();
        System.out.println(calc.add(4, 2));
        System.out.println(calc.sub(4, 2));
        System.out.println(calc.mul(4, 2));
        System.out.println(calc.div(4, 2));
    }
}
class Calc{
    public int add(int a, int b ) {
        return (a + b);

    }
    public int sub(int c,int d){
        return(c-d);
    }
    public int mul(int e,int f){
        return (e*f);
    }
    public int div(int g,int h){
        return (g/h);
    }

}