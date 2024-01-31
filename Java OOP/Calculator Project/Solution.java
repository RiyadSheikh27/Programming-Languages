
package javaapplication22;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=(AdvancedArithmetic) new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("Devisor is: \n"+sum);
    }
}
