
package array_demo;

import java.util.Scanner;


public class Array8 {
    
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] c = new int[2][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Elements For A Matrix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ", row, col);
                A[row][col] = input.nextInt();
            }

        }
        System.out.println("Enter Elements For B Matrix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]= ", row, col);
                B[row][col] = input.nextInt();
            }

        }
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + B[row][col]);
            }
            System.out.println();
        }
 System.out.println("\n");
        System.out.print("A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+(A[row][col]+B[row][col]));
    }
            System.out.println(); 
}
    }}

