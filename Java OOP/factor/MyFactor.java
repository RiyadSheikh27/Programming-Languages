
package Assignment_oop;

import java.util.Scanner;

public class MyFactor implements CustomizedInterface {
    
    
   public int factorSum(int n){
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer number :");
      n = sc.nextInt();
     int i;
       System.out.print("Divisors of " + n + " are ");
      for( i = 1; i<n; i++) {
         if(n % i == 0) {
            System.out.print(i+"+");
            
         }
        
      }
       System.out.print(""+n);
    int sum=1;
    for( i=2;i<=(n/2);i++){
        if(n%i==0)sum+=i;
    }
    if(n!=1)return sum+n;
    else return sum;
    
} 
   
  
}
    
      
       
