
package array_demo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println(" Size = "+number.size());
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,65);
        System.out.println(number);
        System.out.println();
          System.out.println(" Size = "+number.size());
          
           
          for(int x : number)
          System.out.print(" "+x);
           
           System.out.println();
           
         Iterator itr = number.iterator();
         while(itr.hasNext()){
             System.out.print(" "+itr.next());
            
             number.remove(2);
             System.out.println(number);
          
         
         }
    }
    
}
