
package Basic;

import java.util.Scanner;


public class User_Input {
    public static void main(String[] args) {
        float age;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age : ");
        age = input.nextFloat();
        System.out.println("Your Age Is : "+age);   
    }
 
}
