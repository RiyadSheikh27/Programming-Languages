package From73;

import com.sun.source.tree.BinaryTree;
import java.util.Scanner;

public class DecimalToOthers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Enter Any Decimal Number = ");
        decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        
        String hexa = Integer.toHexString(decimal);
        System.out.println(hexa);
        
        
    }
}
