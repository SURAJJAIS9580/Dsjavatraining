package OOPS.Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("Im child");
        Parents parents = new Parents();
        parents.printName();
        parents.printGrandParentName();
    }
}
class Parents extends GrandParents{
    public void printName() {
        System.out.println("Im parents");
    }
}
class GrandParents{
    public void printGrandParentName() {
        System.out.println("Im Grand parents");
    }
}