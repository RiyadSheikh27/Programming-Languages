package practice6;

import java.util.Scanner;

public class main {
    //Sum of Numbers
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int sum = 0;

        while(num != 0){
            int r= num % 10;
            sum = sum+r;
            num = num / 10;
        }
        System.out.println("Result is "+sum);
    }
}
