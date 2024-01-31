package array_demo;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.print("Please Enter 5 Numbers = ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();

        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);
        double avg = sum / 5;
        System.out.println(avg);

    }

}
