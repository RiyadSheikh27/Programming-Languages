
package From40;

import java.util.Scanner;


public class PatternDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Line Number : ");
        int n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
                
            }
            System.out.println("");
            
        }
            
        }
        
    }
    

