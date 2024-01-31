package practice5;

import java.util.Scanner;

public class main {
    // Fibonacci Number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum;
        int first = 0, second = 1;
        System.out.print(first+" "+second);
        for (int i = 3; i <= num; i++) {
            sum = first+second;
            System.out.print(" "+sum);
            first = second;
            second = sum;
        }

    }
}