
package array_demo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrays {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(-4);
        number.add(0);
        number.add(42);
        number.add(25);
        
        System.out.println("Befor Sorting = "+number);
        
      Collections.sort(number);
        System.out.println("After Sorting in Ascending = "+number);
        
      Collections.sort(number,Collections.reverseOrder());
        System.out.println("After Sorting in Descending = "+number);
        
    }
    
}
