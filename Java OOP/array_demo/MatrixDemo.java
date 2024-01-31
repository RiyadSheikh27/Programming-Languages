package array_demo;

import java.util.Scanner;

public class MatrixDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiagonalElemants = 0;
        int SumOfUpperElements = 0;
        int SumOfLowerElements = 0;

        //Getting input
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();

            }
        }
        //diaram,upper triange,lower triangle
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    SumOfDiagonalElemants = SumOfDiagonalElemants + A[row][col];

                }
                if (row < col) {
                    SumOfUpperElements = SumOfUpperElements + A[row][col];
                }

                if (row > col) {
                    SumOfLowerElements = SumOfLowerElements + A[row][col];
                }

            }
        }
        System.out.println("Sum of Diagonal Elements = " + SumOfDiagonalElemants);
        System.out.println("Sum of Upper Elements = " + SumOfUpperElements);
        System.out.println("Sum of Lower Elements = " + SumOfLowerElements);
    }
}
