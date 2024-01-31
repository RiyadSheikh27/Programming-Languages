
package beginnerjava;

import java.util.Scanner;


public class TimeTable2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        
        System.out.print("Enter First Number = ");
        n = input.nextInt();
        
        System.out.print("Enter Second Number = ");
        m = input.nextInt();
        
        for (int i = n; i <=m; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i+" x "+j + " = "+i*j);

            }
            System.out.println("\n\n");
        }
    }
    
}
