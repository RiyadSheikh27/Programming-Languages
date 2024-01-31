
package array_demo;

public class Array1 {
    public static void main(String[] args) {
        int[] number = new int[5];
        int sum;
        int len;

        //------------

        number[0] = 5;
        number[1] = 4;
        number[2] = 6;
        number[3] = 7;
        number[4] = 8;
        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println(sum);

        len = number.length;
        System.out.println("Lenth of Array = " + len);
        // Gitpush2

    }
}
