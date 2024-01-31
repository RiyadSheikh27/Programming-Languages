package practice7;


import java.util.Scanner;

public class main {
    //Sum of Numbers and palindrome and reverse and armstrong
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
int sum = 0;

        while(num != 0){
            int r= num % 10;
            sum = sum+(r*r*r);
            num = num / 10;
        }
        System.out.println(sum);
      
    }
}
