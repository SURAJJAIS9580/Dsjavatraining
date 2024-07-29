package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        //arraylist is advance on array take less size
        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding the data in arraylist
        for (int j = 1; j <= 7; j++) {
            arrayList.add(j);
        }

        //accessing the data from arraylist
        for (int item :arrayList)
        {
            System.out.println(item);
        }

        //remove the item from arraylist
        arrayList.remove(3);

        //print the arraylist
        System.out.println(arrayList);

        //print the size of the arraylist
        System.out.println(arrayList.size());

        //Create another arraylist with unordered data with size 6
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 1; i <=6 ; i++) {
            Random random = new Random();
            arrayList1.add(random.nextInt(10));
        }

        //print the unordered arraylist
        System.out.println(arrayList1);

        //to sort the arraylist using high order function
        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //add two arraylist items
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(arrayList.get(i) + arrayList1.get(i));
        }
        //print the arraylist 3 after addition
        System.out.println(arrayList2);
    }
}