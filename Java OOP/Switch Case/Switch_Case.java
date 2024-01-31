
package Basic;

import java.util.Scanner;

public class Switch_Case {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
           System.out.print("Please Enter Any Number : ");
           num = input.nextInt();
           
           switch(num){
               case 1 : System.out.println("One");
               break;
               case 2 : System.out.println("Two");
               break;
               case 3 : System.out.println("Three");
               break;
               default:
                   System.out.println("Error...");
           
           
           
           }
    }
}
