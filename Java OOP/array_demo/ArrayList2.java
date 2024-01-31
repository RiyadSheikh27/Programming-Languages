package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 65);

        for (int x : number) {
            System.out.print(" " + x);
        }

        System.out.println();
        System.out.println(" Size = " + number.size());
        boolean contain = number.contains(30);
        System.out.println("30 is on the list = " + contain);
        
        int pos = number.indexOf(30);
        System.out.println("Index of number 30 = "+pos);
        
        number.set(3, 40);
        System.out.println("After Replessing = "+number);
        
        int x = number.get(0);
        System.out.println("Index 0 = "+x);

        number.clear();
        System.out.println(number);

        boolean check = number.isEmpty();
        System.out.println(check);
    }
}
