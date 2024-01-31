package practice4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,factorial=1;

        System.out.println("Which Multiplication Table?");
        m = input.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println("");
        System.out.println("The sum is " + sum);
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
            fact = fact * j;
        }
        System.out.println("");
        System.out.println("The factorual is is " + fact);
        for(int k = 1;k<=10;k++){
          System.out.println(m+" X "+k+" = "+m*k);
        }

    }
}