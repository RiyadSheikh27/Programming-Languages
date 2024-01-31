package array_demo;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] number = {10, -5, 31, 22, 35};
        Arrays.sort(number);

        System.out.print("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + number[i]);

        }
        System.out.println();
        System.out.print("Descending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + number[i]);

        }
        System.out.println();
        String[] names = {"Rabbi","Noman","Abir"};
        Arrays.sort(names);
        for (int i = 0; i < 3; i++) {
            System.out.print(" "+names[i]);
        }
        
    }
}
