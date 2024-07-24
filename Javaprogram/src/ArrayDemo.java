public class ArrayDemo {
    public static void main(String[] args) {
        String[] friendnames = {"Alakh", "Priyanshu", "Vansh", "Raj", "Rohit"};
        for (int i = 0; i < friendnames.length; i++) {
            System.out.println(friendnames[i]);
        }
        friendnames[3] = "rini";
        for (int i = 0; i < friendnames.length; i++) {
            System.out.println(friendnames[i]);
        }
        // print the name of friends using for each loop
        for(String i : friendnames){
            System.out.println(i);
        }
        findEvenOddNumber(3);

    }
    private static void findEvenOddNumber(int i){

    }
}

// print the name of friends using for each loop




